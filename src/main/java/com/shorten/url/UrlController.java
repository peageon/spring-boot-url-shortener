package com.shorten.url;

import com.google.common.hash.Hashing;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.nio.charset.StandardCharsets;

@RestController()
@Validated
public class UrlController {
    @Autowired
    StringRedisTemplate redisTemplate;


    @GetMapping("/{id}")
    public String getUrl(@PathVariable(value = "id") String id) {
        String url = redisTemplate.opsForValue().get(id);
        return url;
    }

    @PostMapping
    public String create(@Valid @RequestBody MyRequest request) {
        String id = Hashing.murmur3_32_fixed().hashString(request.getUrl(), StandardCharsets.UTF_8).toString();
        System.out.println("Hashed url is " + id);
        redisTemplate.opsForValue().set(id, request.getUrl());
        return id;
    }
}

