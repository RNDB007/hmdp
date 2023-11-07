package com.hmdp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author Joe Lee
 * @date
 * @Description
 */
@SpringBootTest
public class redisTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void testString(){

       stringRedisTemplate.opsForValue().set("name","joe");
         System.out.println(stringRedisTemplate.opsForValue().get("name"));

    }
    @Test
    void testHash(){
        stringRedisTemplate.opsForHash().put("user","name","joe");
        stringRedisTemplate.opsForHash().entries("user").forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
