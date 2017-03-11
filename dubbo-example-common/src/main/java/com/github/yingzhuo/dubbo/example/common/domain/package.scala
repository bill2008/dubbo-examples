package com.github.yingzhuo.dubbo.example.common

import java.util.UUID

package object domain {

    def uuid(): String = UUID.randomUUID().toString.replaceAll("-", "")

    trait AbstractDomain extends Serializable {
        def id: String

        def canEqual(other: Any): Boolean = other.isInstanceOf[AbstractDomain]

        override def equals(other: Any): Boolean = other match {
            case that: AbstractDomain =>
                (that canEqual this) &&
                    id == that.id
            case _ => false
        }

        override def hashCode(): Int = {
            val state = Seq(id)
            state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
        }
    }

}
