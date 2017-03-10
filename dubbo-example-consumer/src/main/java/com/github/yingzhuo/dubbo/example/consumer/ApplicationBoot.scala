package com.github.yingzhuo.dubbo.example.consumer

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
class ConfigDubbo
