package com.kaitostenroos.detailedtraintimetable.detailedtraintimetable.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Arrays;

import com.kaitostenroos.detailedtraintimetable.domain.History;
import com.kaitostenroos.detailedtraintimetable.domain.HistoryRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class HistoryController {
    @Autowired
    private HistoryRepository historyRepository;

    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("Message 1", "Message 2", "Message 3"));
    }
    
    @GetMapping("/history")
    public List<History> getHistory() {
        return historyRepository.findAll();
    }

    @PostMapping("/history/{startStationId}/{startStation}/{endStationId}/{endStation}")
    public ResponseEntity<String> postMethodName(@PathVariable String startStationId, @PathVariable String startStation, @PathVariable String endStationId, @PathVariable String endStation, @RequestBody String entity) {
        historyRepository.save(new History(startStationId, startStation, endStationId,endStation));
        return ResponseEntity.ok(entity);
    }
    
    
}
