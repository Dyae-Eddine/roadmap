package com.visual.roadmap.todo.model;

import com.visual.roadmap.todo.model.enums.Period;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;

@Document(collection = "HABITS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Habit {

    @Id
    private String Id;

    private String label;

    private Integer quantityDone;

    private Integer totalQuantity;

    private Integer duration;

}
