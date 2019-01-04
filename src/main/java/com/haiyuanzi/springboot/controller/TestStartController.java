package com.haiyuanzi.springboot.controller;

import com.atguigu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-02 16:46
 * @desc
 **/
@RestController
public class TestStartController {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hello" ,produces="text/plain;charset=UTF-8")
	public String sayHello(){

		return helloService.sayHello ("汉昭烈弟");
	}

}
