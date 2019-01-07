package com.haiyuanzi.springboot.code.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-02 13:53
 * @desc
 **/
@Component
public class MyApplicationRunner implements ApplicationRunner {
	@Override
	public void run (ApplicationArguments args) throws Exception {
		System.out.println ("ApplicationRunner...run...:args:" + args);

	}
}
