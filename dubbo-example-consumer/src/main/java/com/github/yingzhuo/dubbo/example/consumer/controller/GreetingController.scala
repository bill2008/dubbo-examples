package com.github.yingzhuo.dubbo.example.consumer.controller

import com.github.yingzhuo.dubbo.example.common.{Greeting, GreetingService}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(Array("/greeting"))
class GreetingController @Autowired()(val greetingService: GreetingService) {

    @RequestMapping(Array("/"))
    def greeting: Any = {
        val greeting: Greeting = greetingService.doGreeting()
        greeting
    }

}
