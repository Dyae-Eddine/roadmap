package com.visual.roadmap.todo.repository;

import com.visual.roadmap.todo.model.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal, String> {
}
