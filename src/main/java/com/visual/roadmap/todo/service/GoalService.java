package com.visual.roadmap.todo.service;

import com.visual.roadmap.todo.model.Goal;
import com.visual.roadmap.todo.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {

    private final GoalRepository goalRepository;

    @Autowired
    public GoalService(GoalRepository goalRepository){
        this.goalRepository=goalRepository;
    }

    public Goal createGoal(Goal goal){
        return goalRepository.save(goal);
    }

    public void deleteGoal(Goal goal){
        goalRepository.delete(goal);
    }
}
