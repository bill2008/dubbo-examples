package com.github.yingzhuo.dubbo.example.consumer.controller

import java.util

import com.github.yingzhuo.dubbo.example.common.domain.User
import com.github.yingzhuo.dubbo.example.common.service.UserService
import com.typesafe.scalalogging.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/users"))
class UserController @Autowired()(val userService: UserService) {

    val logger = Logger(classOf[UserController])

    @GetMapping
    def findAll(): util.List[User] = userService.findAllUsers()

    @GetMapping(Array("/{id}"))
    def findOne(@PathVariable("id") userId: String): User = {
        val user = userService.findUserById(userId)
        logger.debug(s"user = $user")
        user
    }

}
