package interpreter;

public class Identificator {
    private String type;
    private String id;
    private String value;

    public Identificator(String type, String id, String value) {
        this.type = type;
        this.id = id;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
