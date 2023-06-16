package co.edu.politecnicojic.todoapp.mapper;

import co.edu.politecnicojic.todoapp.persistence.entity.Task;
import co.edu.politecnicojic.todoapp.persistence.entity.TaskStatus;
import co.edu.politecnicojic.todoapp.services.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{
    @Override
    public Task mapper(TaskInDTO in){
        Task task = new Task();
        task.setName(in.getName());
        task.setDescription(in.getDescription());
        task.setCreateDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
