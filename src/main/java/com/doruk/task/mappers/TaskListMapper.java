package com.doruk.task.mappers;

import com.doruk.task.domain.dto.TaskListDto;
import com.doruk.task.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
