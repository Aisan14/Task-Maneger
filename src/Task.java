public class Task {
    // уникальный индекс задачи
    protected int id;
    // Название задачи
    protected String title;
    // Описание задачи
    protected  String description;
    //Статус задачи(NEW, IN_PROGERSS, DONE)

    Status status = Status.NEW;


    //Конструктор задачи
    public Task(String title, String description){
        // Инициализируме название и описпние задачи
        this.title = title;
        this.description = description;
        //Устанавливаем начальный статус задачи как NEW
        this.status=Status.NEW;
    }

    public int getId(){return id;}

    public void setId(int id) {this.id = id;}

    public String getTitle(){return  title;}

    public void setTitle(){this.title = title;}

    public String getDescription(){return description;}

    public void  setDescription(){this.description = description;}

    public Status getStatus(){return status;}

    public void setStatus(Status status){
        this.status =status;
    }
}