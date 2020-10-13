package com.seungmoo.springboot.cors_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CorsServerApplication {
    
    // cors 적용하기, 18080서버에서 본 서버의 리소스를 가져갈 수 있게 허용해준다.
    // 보통은 허용할 Controller에 붙이거나, 여러 Controller에 적용한다면 Config파일에서 적용해준다.
    //@CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(CorsServerApplication.class, args);
    }

}
