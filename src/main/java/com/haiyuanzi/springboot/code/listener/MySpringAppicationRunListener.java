package com.haiyuanzi.springboot.code.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-02 13:41
 * @desc
 **/
public class MySpringAppicationRunListener implements SpringApplicationRunListener{
	public MySpringAppicationRunListener (SpringApplication application, String[] args) {
	}

	@Override
	public void starting () {
		System.out.println ("SpringApplicationRunListener...starting...");
	}

	@Override
	public void environmentPrepared (ConfigurableEnvironment environment) {
		Object o = environment.getSystemProperties ().get ("os.name");
		System.out.println ("SpringApplicationRunListener...ConfigurableEnvironment..."+o);
	}

	@Override
	public void contextPrepared (ConfigurableApplicationContext context) {
		System.out.println ("SpringApplicationRunListener...contextPrepared...");
	}

	@Override
	public void contextLoaded (ConfigurableApplicationContext context) {
		System.out.println ("SpringApplicationRunListener...contextLoaded...");
	}

	@Override
	public void started (ConfigurableApplicationContext context) {
		System.out.println ("SpringApplicationRunListener...started...");
	}

	@Override
	public void running (ConfigurableApplicationContext context) {
		System.out.println ("SpringApplicationRunListener...running...");
	}

	@Override
	public void failed (ConfigurableApplicationContext context, Throwable exception) {
		System.out.println ("SpringApplicationRunListener...failed...");
	}
}
