package com.visual.roadmap.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "STEPS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Step {

    @Id
    private String id;

    private String label;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private Integer percentage;

    private List<Habit> habits;

    private List<Step> nextSteps;

}
