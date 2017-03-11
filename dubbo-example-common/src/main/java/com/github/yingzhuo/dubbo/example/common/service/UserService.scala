package com.github.yingzhuo.dubbo.example.common.service

import java.util.{List => JList}

import com.github.yingzhuo.dubbo.example.common.domain.User

trait UserService {

    def findUserById(id: String): User

    def findAllUsers(): JList[User]

}
