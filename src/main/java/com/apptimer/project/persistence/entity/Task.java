package com.apptimer.project.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 *
 *  Timer APP
 *  Agendapp
 *
 *  Gestion de tareas personal // Personal Task management
 *
 * @version 1.0.0 2023-06-16
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@Data //De Lombok para Getters y Setters
@Entity
@Table(name = "task")
public class Task {

    //Atributos de Task - tareas del proyecto
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
