package com.apptimer.project.service;

import com.apptimer.project.persistence.entity.Task;
import com.apptimer.project.persistence.entity.repository.TaskRepository;
import org.springframework.stereotype.Service;


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

@Service
public class TaskService {

    // @Bean
    //Inyección de Dependencias siempre con contructor
    private final TaskRepository taskRepository;

    //Contrutor inyección de dependencias
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {

    }


}
