package com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// DashboardController.java
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/{userId}")
    public ResponseEntity<Object> getDashboard(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getUserPerformance(userId));
    }
}