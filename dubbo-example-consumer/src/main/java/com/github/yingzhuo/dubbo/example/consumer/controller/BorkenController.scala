package com.github.yingzhuo.dubbo.example.consumer.controller

import com.github.yingzhuo.dubbo.example.common.service.UserService
import com.github.yingzhuo.dubbo.example.common.service.ex.BusinessException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class BorkenController @Autowired()(val userService: UserService) {

    @GetMapping(Array("/borken"))
    def borken(): Unit = {
        try {
            userService.borken()
        } catch {
            case e: BusinessException => println(s"${e.getClass} => ${e.getMessage}")
            case e: Throwable => println(s"${e.getClass} => ${e.getMessage}")
        }
    }

}
