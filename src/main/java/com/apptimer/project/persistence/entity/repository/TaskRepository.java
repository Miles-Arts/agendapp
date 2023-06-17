package com.apptimer.project.persistence.entity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;


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

public interface TaskRepository extends JpaRepository<Task, Long> {



}
