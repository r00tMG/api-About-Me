package com.root.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Committer {
    @Id @GeneratedValue
    private Integer id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String tel;
}
