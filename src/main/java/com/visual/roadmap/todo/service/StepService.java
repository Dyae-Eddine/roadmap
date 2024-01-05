package com.visual.roadmap.todo.service;

import com.visual.roadmap.todo.model.Step;
import com.visual.roadmap.todo.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService {


    private StepRepository stepRepository;

    @Autowired
    public StepService(StepRepository stepRepository){
        this.stepRepository = stepRepository;
    }

    public Step createStep(Step step){
        return stepRepository.save(step);
    }

    public void deleteStep(Step step){
        stepRepository.delete(step);
    }
}
