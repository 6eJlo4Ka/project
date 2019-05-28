import java.time.LocalDate;
import java.time.Period;

public class Subs {


    private int id;
    private int p_id;

    private LocalDate dateOfS;
    private LocalDate dateOfF;

    public Subs() {
        this.id = id;
        this.p_id = p_id;
        this.dateOfS = dateOfS;
        this.dateOfS = dateOfF;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public LocalDate getDateOfF() {
        return dateOfF;
    }

    public void setDateOfF(LocalDate dateOfF) {
        this.dateOfF = dateOfF;
    }

    public LocalDate getDateOfS() {
        return dateOfS;
    }

    public void setDateOfS(LocalDate dateOfS) {
        this.dateOfS = dateOfS;
    }

    public int getResult(LocalDate dateOfS, LocalDate dateOfF) {
        Period period = Period.between(dateOfF, dateOfS);
        int month = period.getMonths();
        return month;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", p_id=" + p_id +
                ", дата начала =" + dateOfS +
                ", дата конца=" + dateOfF +
                '}';
    }



}
   
