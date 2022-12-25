package com.techgen.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "techgen.jwt")
public class JwtProperties {
    private String secretKey;
    private Long expirationMilliseconds;
}
