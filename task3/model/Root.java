package task3.model;


import java.util.List;

public class Root {

    private String value;
    private List<Values> values;

    public String getValue(){return value;}

    public List<Values> getValues(){return values;}

    public void setValue(String value){
        this.value = value;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }

    @Override
    public String toString(){
        return "Root{"+
                "value='" + value + '\'' +
                ", values=" + values +
                '}';
    }
}
