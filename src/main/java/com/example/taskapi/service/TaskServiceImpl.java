package com.example.taskapi.service;

import com.example.taskapi.entity.Task;
import com.example.taskapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Optional<Task> findById(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Task create(Task task) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Task update(Long id, Task task) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
