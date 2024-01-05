package com.visual.roadmap.todo.repository;

import com.visual.roadmap.todo.model.Habit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository extends MongoRepository<Habit, String> {

}
