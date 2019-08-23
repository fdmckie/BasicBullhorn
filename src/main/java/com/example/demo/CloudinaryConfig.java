package com.example.demo;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CloudinaryConfig {
    private Cloudinary cloudinary;
    @Autowired
    public CloudinaryConfig(@Value("$cloud.key") String key, @Value("${cloud.secret}") String secret, @Value("$(cloud.name}") String cloud){
        cloudinary = Singleton.getCloudinary();
        cloudinary.config.cloudName=cloud;
        cloudinary.config.apiSecret=secret;
        cloudinary.config.apiKey=key;
    }
}

