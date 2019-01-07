package com.haiyuanzi.springboot.code.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-02 11:21
 * @desc 监听器的使用
 **/
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

	@Override
	public void initialize (ConfigurableApplicationContext applicationContext) {
		System.out.println ("ApplicationContextInitializer的initialize方法启动");
	}
}
