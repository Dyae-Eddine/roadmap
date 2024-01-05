package com.visual.roadmap.user.model;

import com.visual.roadmap.user.model.enums.Rights;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "USERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private String Id;

    private String email;

    private String userName;

    private String password;

    private List<Rights> rights;
}
