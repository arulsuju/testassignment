package com.hackerrank.testassignment.controller;

import com.hackerrank.testassignment.entity.Games;
import com.hackerrank.testassignment.service.GamesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GamesController {
    @Autowired
    GamesService gamesService;

    //saving games
    @PostMapping(value = "/saveGames",consumes = MediaType.APPLICATION_JSON_VALUE )
    public Games saveGames(@RequestBody Games games){
        Games g=games;
        return gamesService.save(g);
    }

    //listing all games
    @GetMapping("/getAll")
    public List<Games> getAll(){
        List<Games> list=gamesService.getAll();
        return list;

    }
    //listing game based on title search
    @GetMapping("/getByTitle/{title}")
    public Games getByTitle(@PathVariable String title){
        return gamesService.findByTitle(title);
    }

    @DeleteMapping("/deleteByTitle/{title}")
    public void deleteByTitle(@PathVariable String title){
        gamesService.deleteByTitle(title);
        //System.out.println("Deleted");
    }
}
