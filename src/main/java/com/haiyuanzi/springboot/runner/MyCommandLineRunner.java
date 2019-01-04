package com.haiyuanzi.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-02 13:54
 * @desc
 **/
@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Override
	public void run (String... args) throws Exception {
		System.out.println ("CommandLineRunner...run...:args:" + Arrays.asList (args));
	}
}
