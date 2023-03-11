package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {
    
    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
        //Save Project
        project.setName("Projeto Teste");
        project.setDescription("description");
        projectController.save(project);
       
        //Update Project
        project.setId(1);
        project.setName("Novo nome do projeto");
        project.setDescription("description");
        projectController.update(project);
        
        //GetAll Controlle
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());
        
        //DeleteById
        projectController.removeById(1);
        
        // Task
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        
        //Save Task
        task.setIdProject(2);
        task.setName("Criar as telas de aplicação");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        taskController.save(task);
        
        
        //Update Task
        task.setId(1);
        task.setIdProject(2);
        task.setName("Alterar telas da aplicação");
        task.setDescription("telas criadas os cadastros");
        task.setNotes("Com notas");
        task.setIsCompleted(true);
        task.setDeadline(new Date());
        taskController.update(task);

        //GetAll Task
        List<Task> tasks = taskController.getAll();
        System.out.println("Total de tarefas = " + tasks.size());
        
        //DeleteById
        taskController.removeById(1);
        
    }
}
