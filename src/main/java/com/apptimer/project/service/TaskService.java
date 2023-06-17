package com.apptimer.project.service;

import com.apptimer.project.persistence.entity.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

   // @Bean
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
