package com.hmdp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Joe Lee
 * @date
 * @Description
 */
@SpringBootTest
public class redisTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void testString(){

        System.out.println(redisTemplate.opsForValue().get("name"));

    }
}
