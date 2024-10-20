package com.alextechsolutions.travelinsights.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="")
public class TI_customerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String full_name;
    private String email;
    private String password;

}
