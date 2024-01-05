package com.visual.roadmap.todo.model;


import com.visual.roadmap.todo.model.enums.Priority;
import com.visual.roadmap.todo.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "GOALS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Goal {

    @Id
    private String id;

    private String label;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private Priority priority;

    private Status status;

    private List<Step> step;

}
