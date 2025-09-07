package com.doruk.task.domain.dto;

import com.doruk.task.domain.entities.TaskPriority;
import com.doruk.task.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
