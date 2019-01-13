package com.haiyuanzi.springboot;

import com.haiyuanzi.springboot.cache.bean.Employee;
import com.haiyuanzi.springboot.cache.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLearnApplicationTests {

	@Autowired
	StringRedisTemplate stringRedisTemplate;//操作k-v都是字符串的

	@Autowired
	RedisTemplate redisTemplate;//key-v 都是对象的

//	@Autowired
//	RedisTemplate<Object,Employee> empRedisTemplate;

	/**
	 * Redis 常见的五大数据类型
	 * 	String(字符串) List（列表） Set（集合） Hash（散列） ZSet（有序集合）
	 */
	@Test
	public void test_ () {

		//保存数据
//		stringRedisTemplate.opsForValue ().append ("msg","hello");

		//查询数据
//		String msg = stringRedisTemplate.opsForValue ().get ("msg");
//		System.out.println (msg);

		stringRedisTemplate.opsForList ().leftPush ("mylist","1");
		stringRedisTemplate.opsForList ().leftPush ("mylist","2");

	}

	@Autowired
	EmployeeMapper  employeeMapper;

	/**
	 * 测试保存对象
	 */
	@Test
	public void test_2() {
		Employee emp = employeeMapper.getEmpById (1);
//		默认如果保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
		redisTemplate.opsForValue ().set ("emp-01",emp);
		Object o = redisTemplate.opsForValue ().get ("emp-01");
		System.out.println (o);

	}

//	@Test
//	public void contextLoads() {
//		Employee emp = employeeMapper.getEmpById (1);
//		//		默认如果保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
//		empRedisTemplate.opsForValue ().set("emp-01",emp);
//	}

}

