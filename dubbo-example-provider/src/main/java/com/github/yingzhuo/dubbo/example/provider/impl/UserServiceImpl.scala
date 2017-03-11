package com.github.yingzhuo.dubbo.example.provider.impl

import java.util

import com.github.yingzhuo.dubbo.example.common.domain.User
import com.github.yingzhuo.dubbo.example.common.service.UserService

import scala.collection.JavaConverters._

class UserServiceImpl extends AnyRef with UserService {

    private[this] val allUsersMap = Map[String, User](
        "1" -> User("1", "应卓", 35),
        "2" -> User("2", "文晶晶", 32)
    ).withDefaultValue(null)

    override def findUserById(id: String): User = allUsersMap(id)

    override def findAllUsers(): util.List[User] = allUsersMap.values.toList.asJava

}
