package com.apptimer.project.service.dto;



import lombok.Data;

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

//Tarea de entrada para DTO
    //Objeto de Tranferencia de Datos
@Data  //Data añade los Getters y Setters
public class TaskInDTO {

    /*private Long id;*/
    private String title;
    private String description;
/*
    private LocalDateTime createdDate;
*/
    private LocalDateTime eta;
//   /* private boolean finished;
//    private TaskStatus taskStatus;*/

}
