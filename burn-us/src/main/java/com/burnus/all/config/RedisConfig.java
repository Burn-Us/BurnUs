package com.burnus.all.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@EnableCaching
@Configuration
public class RedisConfig {
	
	//application.properties에서 값 가져와 사용
	@Value("${spring.data.redis.host}")
	private String host;
	
	@Value("${spring.data.redis.port}")
	private String port;
	
	@Value("${spring.data.redis.password}")
	private String password;
	
	//redis 연결을 위한 method
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		//RedisStandaloneConfiguration 객체 생성해 host, port, password 정보 입력
		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
		redisStandaloneConfiguration.setHostName(host);
		//Integer type
		redisStandaloneConfiguration.setPort(Integer.parseInt(port));
		redisStandaloneConfiguration.setPassword(password);
		
		// Spring 프레임워크에서 Redis와의 연결을 관리하기 위한 클래스
		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
		
		//return lettuceConnectionFactory
		return lettuceConnectionFactory;
	}
	
	//key - value input / use -> Template
	//string: key object: value
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		
		//redisTemplate return
		return redisTemplate;
	}
	

}
