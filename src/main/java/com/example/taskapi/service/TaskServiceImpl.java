package com.example.taskapi.service;

import com.example.taskapi.entity.Task;
import com.example.taskapi.mapper.TaskMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public List<Task> findAll() {
        return taskMapper.findAll();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskMapper.findById(id);
    }

    @Override
    public Task create(Task task) {
        taskMapper.insert(task);
        return task;
    }

    @Override
    public Task update(Long id, Task task) {
        task.setId(id);
        int updated = taskMapper.update(task);
        if (updated == 0) {
            throw new IllegalArgumentException("Task not found: " + id);
        }
        return task;
    }

    @Override
    public void delete(Long id) {
        taskMapper.deleteById(id);
    }
}
