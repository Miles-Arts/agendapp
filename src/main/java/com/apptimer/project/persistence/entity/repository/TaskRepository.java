package com.apptimer.project.persistence.entity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {



}
