public class Subtask extends  Task {
    //Эпик, к которому относится подзадача
    private  Epic epic;

    //Конструтор подзадачи
    public Subtask(String title, String description, Epic epic){
        //Вызываем конструктор, суперкласса Task
        super(title,description);
        // Запоминаем эпик, к которому относится задача
        this.epic = epic;
    }

    //ереопределенный метод установки статус подзадачи
    @Override
    public void setStatus(Status status){
        //Устанавливаем статус подзадачи с помощью метода суперкласса
        super.setStatus(status);
        //Обновляем статус эпика, к которому относится задача
        epic.updateStatus(); //!!!!
    }


    //етод для получения эпика, к которому относится подзадача
    public Epic getEpic(){ return epic;}
}
