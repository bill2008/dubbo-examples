package com.github.yingzhuo.dubbo.example.consumer

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.{Configuration, ImportResource}

object ApplicationBoot extends App {

    SpringApplication.run(classOf[ApplicationBoot], args: _*)

}

@SpringBootApplication
class ApplicationBoot

@Configuration
@ImportResource(Array("classpath*:/dubbo/*.xml"))
class ApplicationBootConfigDubbo

@Configuration
class ApplicationBootConfigJackson {

    @Autowired(required = false)
    def configObjectMapper(objectMapper: ObjectMapper): Unit = {
        objectMapper.registerModules(DefaultScalaModule)
    }

}
