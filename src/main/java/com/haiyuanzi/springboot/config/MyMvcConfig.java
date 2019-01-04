package com.haiyuanzi.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2018-12-29 15:24
 * @desc mvc配置拓展
 **/
@Configuration
@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers (ViewControllerRegistry registry) {
		registry.addViewController ("/hello").setViewName ("success");

	}
}
