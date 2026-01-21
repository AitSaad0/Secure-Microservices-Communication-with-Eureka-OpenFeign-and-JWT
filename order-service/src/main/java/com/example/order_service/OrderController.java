package com.example.order_service;


import com.example.order_service.dto.OrderRequestDto;
import com.example.order_service.dto.OrderResponseDto;
import com.example.order_service.dto.UserResponseDto;
import com.example.order_service.feign.UserClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @PostMapping("/getUserOrder")
    public ResponseEntity<OrderResponseDto> getUser(@RequestBody OrderRequestDto request) {
        UserResponseDto userResponseDto = userClient.getUser(request.id()).getBody();
        return ResponseEntity.ok(new OrderResponseDto(userResponseDto, request.order()));
    }

}
