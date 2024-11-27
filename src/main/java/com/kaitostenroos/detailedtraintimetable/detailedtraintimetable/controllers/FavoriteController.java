package com.kaitostenroos.detailedtraintimetable.detailedtraintimetable.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaitostenroos.detailedtraintimetable.domain.Favorite;
import com.kaitostenroos.detailedtraintimetable.domain.FavoriteRepository;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:5173")
public class FavoriteController {
    @Autowired
    private FavoriteRepository favoriteRepository;

    @GetMapping("/favorites") 
    public List<Favorite> getFavorites() {
        return favoriteRepository.findAll();
    }


    @PostMapping("/favorites/{startStationId}/{startStation}/{endStationId}/{endStation}") 
    public ResponseEntity<String> postMethodName(@PathVariable String startStationId, @PathVariable String startStation, @PathVariable String endStationId, @PathVariable String endStation, @RequestBody String entity) {
        favoriteRepository.save(new Favorite(startStationId, startStation, endStationId, endStation));
        return ResponseEntity.ok(entity);
    }
    @DeleteMapping("/favorites/{id}") 
    public ResponseEntity<String> deleteMethodName(@PathVariable Long id) {
        favoriteRepository.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

}
