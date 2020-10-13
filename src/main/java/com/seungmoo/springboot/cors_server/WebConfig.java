package com.seungmoo.springboot.cors_server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// WebMvcConfigurer 를 통해 스프링에서 제공하는 Config내용에 필요한 커스텀 설정을 덧붙여서 확장한다. (이전강의 참고)
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 이렇게 하면 모든 컨트롤러에 일일이 설정하지 않고
        // 하나의 Config에서 CORS를 설정할 수 있다.
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:18080");
    }
}
