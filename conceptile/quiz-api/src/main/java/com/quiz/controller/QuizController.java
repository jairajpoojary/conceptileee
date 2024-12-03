package com.quiz.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// QuizController.java
// QuizController.java
@RestController
@RequestMapping("/quiz")
public class QuizController {
    
    @Autowired
    private QuizService quizService;
    
    @PostMapping("/take/{userId}")
    public ResponseEntity<Object> getQuestion(@PathVariable Long userId) {
        return ResponseEntity.ok(quizService.getRandomQuestion(userId));
    }
    
    @PostMapping("/submit/{userId}")
    public ResponseEntity<Object> submitAnswer(
            @PathVariable Long userId,
            @RequestBody Map<String, Object> answer) {
        return ResponseEntity.ok(quizService.submitAnswer(userId));
    }
    
    @PostMapping("/end/{userId}")
    public ResponseEntity<Object> endQuiz(@PathVariable Long userId) {
        return ResponseEntity.ok(quizService.endQuiz(userId));
    }
}