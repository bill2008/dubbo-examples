package com.github.yingzhuo.dubbo.example.provider.impl

import com.github.yingzhuo.dubbo.example.common.{Greeting, GreetingService}

class GreetingServiceImpl extends AnyRef with GreetingService {

    override def doGreeting(): Greeting = new Greeting("应卓", "你好，残酷世界。")

}
