package com.hackerrank.testassignment.service;

import com.hackerrank.testassignment.entity.Games;


import java.util.List;


public interface GamesService {

    Games save(Games games);
    List<Games> getAll();
    Games findByTitle(String title);
    void deleteByTitle(String title);

}
