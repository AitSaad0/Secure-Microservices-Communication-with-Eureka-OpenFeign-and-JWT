package com.example.order_service.feign;

import com.example.order_service.dto.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {
    @GetMapping("/api/users/{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long id);
}
