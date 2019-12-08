package com.hackerrank.testassignment.service;

import com.hackerrank.testassignment.entity.Games;
import com.hackerrank.testassignment.repo.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesServiceImpl implements GamesService {

    @Autowired
    public GamesRepository gamesRepository;
    @Override
    public Games save(Games games) {
        return gamesRepository.save(games);
    }

    @Override
    public List<Games> getAll() {
        return gamesRepository.findAll();
    }

    @Override
    public Games findByTitle(String title) {
        return gamesRepository.findByTitle(title);
    }

    @Override
    public void deleteByTitle(String title) {
        gamesRepository.deleteByTitle(title);
    }


}
