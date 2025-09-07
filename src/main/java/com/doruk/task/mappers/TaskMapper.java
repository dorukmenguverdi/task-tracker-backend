package com.doruk.task.mappers;

import com.doruk.task.domain.dto.TaskDto;
import com.doruk.task.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
