import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends  Task{
    // Хранилищте дял подзадач эпика
    private HashMap<Integer, Subtask> subtasks;

    //Коструктор эпика
    public Epic (String title, String description){
        // Вызываем конструктор суперкласса Task
        super(title,description);
        //Инициализируем хранилищие  для подзадач
        this.subtasks = new HashMap<>();
    }

    //Метод для обновления эпика
    public void updateStatus(){
        //Флаги для определения статуса эпика
        boolean allNew = true;
        boolean allDone = true;

        //Проходим по всем подзадачам эпика
        for(Subtask subtask : subtasks.values()){
            //Проверяем не является ли подзадача NEW
            if(subtask.getStatus() !=Status.NEW){
                allNew = false;
            }
            //Проверяем не является ли подзадача DONE
            if(subtask.getStatus() !=Status.DONE){
                allDone = false;
            }
            //Если уже известно, что не все подзадачи в одном статусе, прерываем цикл
            if(!allNew && !allDone){
                break;
            }
        }

        //Определяем статус эпика на основе статусов подзадач
        if (subtasks.isEmpty() || allNew) {
            setStatus(Status.NEW);
        } else if (allDone) {
            setStatus(Status.DONE);
        } else {
            setStatus(Status.IN_PROGRESS);
        }
    }

    //Метод для получения списка подзадачи эпика
    public ArrayList<Subtask> getSubtask(){return  new ArrayList<>(subtasks.values());}
    // Метод для добавляения подзадачи к эпику
    public void addSubtask(Subtask subtask) {
        subtasks.put(subtask.getId(), subtask);
    }

    // Метод для удаления подазадчи из эпика по Id
    public void removeSubtaskById(int id) {
        subtasks.remove(id);
    }
}