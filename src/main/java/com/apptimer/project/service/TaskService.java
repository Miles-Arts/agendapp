package com.apptimer.project.service;


import com.apptimer.project.mapper.TaskInDTOToTask;
import com.apptimer.project.persistence.entity.Task;
import com.apptimer.project.persistence.entity.repository.TaskRepository;
import com.apptimer.project.service.dto.TaskInDTO;
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
    private final TaskRepository repository;
    private final TaskInDTOToTask mapper; //mapper

    //Contrutor inyección de dependencias
    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO) {

        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
        // implemente el métod correcto save()
    }

    // No estoy tan seguro de que puedas implementar el método findAll sin una interfaz, pero podrías intentarlo
/*    public List<Task> findAll() {
        return this.repository.findAll();
    }*/

}
