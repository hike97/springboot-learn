package com.haiyuanzi.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.net.UnknownHostException;
import java.time.Duration;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-12 15:40
 * @desc 自定义redis配置
 **/
@Configuration
@Slf4j
public class MyRedisConfig {


	private RedisSerializer<String> keySerializer() {
		return new StringRedisSerializer();
	}

	private RedisSerializer<Object> valueSerializer() {
		return new GenericJackson2JsonRedisSerializer();
	}


	@Bean(name = "redisTemplate")
	public RedisTemplate<String, Object> redisTemplate(
			RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		template.setKeySerializer(keySerializer());
		template.setHashKeySerializer(keySerializer());
		template.setValueSerializer(valueSerializer());
		template.setHashValueSerializer(valueSerializer());

		log.debug("自定义RedisTemplate加载完成");
		return template;
	}

	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofDays (1l))
				.disableCachingNullValues();

		RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory)
				.cacheDefaults(config)
				.transactionAware()
				.build();

		log.debug("自定义RedisCacheManager加载完成");
		return redisCacheManager;
	}


}
