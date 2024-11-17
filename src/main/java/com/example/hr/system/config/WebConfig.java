package com.example.hr.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // CORS 설정: 필요한 도메인을 허용
        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:57629")// Flutter 앱의 출처
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // CORS 요청시 OPTIONS도 허용
                .allowCredentials(true)  // 자격 증명 허용
                .allowedHeaders("*");  // 모든 헤더 허용
    }
}