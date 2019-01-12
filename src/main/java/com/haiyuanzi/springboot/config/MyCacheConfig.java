package com.haiyuanzi.springboot.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-10 9:55
 * @desc 自定义key的生成规则
 **/

@Configuration
public class MyCacheConfig {

	@Bean("myKeyGenerator")
	public KeyGenerator keyGenerator(){
		return  new KeyGenerator () {
			@Override
			public Object generate (Object target, Method method, Object... params) {
				return method.getName ()+"["+ Arrays.asList (params).toString ()+"]";
			}
		};
	}
}
