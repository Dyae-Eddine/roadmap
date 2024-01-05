package com.visual.roadmap.todo.controller;


import com.visual.roadmap.todo.model.Step;
import com.visual.roadmap.todo.service.HabitService;
import com.visual.roadmap.todo.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/step")
public class StepController {

    private final StepService stepService;

    @Autowired
    public StepController(StepService stepService){
        this.stepService = stepService;
    }

    @PostMapping("/create")
    public Step createStep(@RequestBody Step step){
        return stepService.createStep(step);
    }
}
