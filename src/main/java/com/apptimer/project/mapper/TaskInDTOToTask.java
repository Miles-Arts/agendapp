package com.apptimer.project.mapper;


import com.apptimer.project.persistence.entity.Task;
import com.apptimer.project.persistence.entity.TaskStatus;
import com.apptimer.project.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

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

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task> {


    @Override
    public Task map(TaskInDTO in) {
       Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
