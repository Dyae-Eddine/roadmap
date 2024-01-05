package com.visual.roadmap.todo.model;

import com.visual.roadmap.todo.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;


@Document(collection = "TODO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {

    @Id
    private String id;

    private String label;

    private Status status;

    private Integer complexity;

    private LocalTime startTime;

    private LocalTime endTime;


    public Todo(String label, Status status, Integer complexity, LocalTime startTime, LocalTime endTime) {
        this.label = label;
        this.status = status;
        this.complexity = complexity;
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
