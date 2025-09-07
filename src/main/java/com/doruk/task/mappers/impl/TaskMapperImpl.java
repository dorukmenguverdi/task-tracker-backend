package com.doruk.task.mappers.impl;

import com.doruk.task.domain.dto.TaskDto;
import com.doruk.task.domain.entities.Task;
import com.doruk.task.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getTitle(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
