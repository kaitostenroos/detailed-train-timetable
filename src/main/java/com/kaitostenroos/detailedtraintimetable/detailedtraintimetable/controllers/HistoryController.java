package com.kaitostenroos.detailedtraintimetable.detailedtraintimetable.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Arrays;

@RestController
public class HistoryController {
    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("Message 1", "Message 2", "Message 3"));
    }
    
    
}
