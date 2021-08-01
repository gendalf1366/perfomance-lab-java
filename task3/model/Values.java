package task3.model;

public class Values {
    private String value;
    private int id;

    public Values(String value, int id){
        this.value = value;
        this.id = id;
    }

    public String getValue(){
        return value;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "Values{" +
                "value='" + value + '\'' +
                ", id=" + id +
                '}';
    }
}
