package com.visual.roadmap.todo.service;

import com.visual.roadmap.todo.model.Habit;
import com.visual.roadmap.todo.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitService {

    private final HabitRepository habitRepository;

    @Autowired
    public HabitService(HabitRepository habitRepository){
        this.habitRepository = habitRepository;
    }

    public Habit createHabit(Habit habit){
        return habitRepository.save(habit);
    }

    public void removeHabit(Habit habit){
        habitRepository.delete(habit);
    }

}
