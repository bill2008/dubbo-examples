package com.github.yingzhuo.dubbo.example.provider.impl

import java.util

import com.github.yingzhuo.dubbo.example.common.domain.User
import com.github.yingzhuo.dubbo.example.common.service.UserService
import com.github.yingzhuo.dubbo.example.common.service.ex.BusinessException
import org.springframework.stereotype.Component

import scala.collection.JavaConverters._

@Component
class UserServiceImpl extends AnyRef with UserService {

    private[this] val allUsersMap = Map[String, User](
        "1" -> User("1", "应卓", 35),
        "2" -> User("2", "文晶晶", 32)
    ).withDefaultValue(null)

    override def findUserById(id: String): User = allUsersMap(id)

    override def findAllUsers(): util.List[User] = allUsersMap.values.toList.asJava

    override def borken(): Unit = throw new BusinessException("出错啦")

}
