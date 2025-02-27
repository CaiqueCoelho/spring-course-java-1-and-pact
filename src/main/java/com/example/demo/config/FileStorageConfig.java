package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URISyntaxException;

@Configuration
@ConfigurationProperties(prefix = "file")
@Data
public class FileStorageConfig {

    private String uploadDir;
}
