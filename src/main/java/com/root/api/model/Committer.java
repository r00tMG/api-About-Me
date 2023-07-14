package com.root.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "committers")

public class Committer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String tel;

}
