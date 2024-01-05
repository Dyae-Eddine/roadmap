package com.visual.roadmap.todo.controller;

import com.visual.roadmap.todo.model.Habit;
import com.visual.roadmap.todo.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping("/habit")
public class HabitController {

    private final HabitService habitService;

    @Autowired
    public HabitController(HabitService habitService){
        this.habitService = habitService;
    }

    @PostMapping("/create")
    public Habit createTodo(@RequestBody Habit habit){
        return habitService.createHabit(habit);
    }
}
