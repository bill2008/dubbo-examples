package com.github.yingzhuo.dubbo.example.common.domain

import scala.beans.BeanProperty

class User extends AbstractDomain {

    @BeanProperty var id: String = _
    @BeanProperty var name: String = _
    @BeanProperty var age: Int = _

    override def toString = s"User(id=$id, name=$name, age=$age)"

}

object User {

    def apply(id: String, name: String, age: Int): User = {
        val user = new User()
        user.id = if (id != null) id else uuid()
        user.name = name
        user.age = age
        user
    }

}