package com.apptimer.project.persistence.entity;



import lombok.Data;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data //De Lombok para Getters y Setters
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto ID
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private boolean finished;
    private TaskStatus taskStatus;



}
