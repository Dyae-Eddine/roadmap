package com.visual.roadmap.todo.repository;

import com.visual.roadmap.todo.model.Step;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StepRepository extends MongoRepository<Step, String> {
}
