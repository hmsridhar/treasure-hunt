package com.gigsky.treasurehunt.dao;

import com.gigsky.treasurehunt.model.dbbeans.Puzzle;
import org.springframework.data.repository.CrudRepository;

public interface PuzzleRepository extends CrudRepository<Puzzle,Long> {
   //Iterable<Puzzle> findAll();
    Puzzle findPuzzleById(Long id);
}
