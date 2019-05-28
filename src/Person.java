import java.time.LocalDate;

public class Person {


    private int id;
    private String name;
    private LocalDate dateOfE;

    public Person(int id, String name, LocalDate dateOfE) {
        this.id = id;
        this.name = name;
        this.dateOfE = dateOfE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfE() {
        return dateOfE;
    }

    public void setDateOfE(LocalDate dateOfE) {
        this.dateOfE = dateOfE;
    }
}
