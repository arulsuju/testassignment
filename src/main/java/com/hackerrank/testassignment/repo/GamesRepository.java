package com.hackerrank.testassignment.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hackerrank.testassignment.entity.Games;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {

    //custom search - search Game by title
    Games findByTitle(String title);
    void deleteByTitle(String title);
}
