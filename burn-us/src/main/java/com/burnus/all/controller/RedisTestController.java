package com.burnus.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class RedisTestController {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@PostMapping("/{key}/{value}")
	public void setValue(@PathVariable String key, @PathVariable String value) {
		redisTemplate.opsForValue().set(key, value);
		}
	
	@GetMapping("/{key}")
	public String getValue(@PathVariable String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
	

}
