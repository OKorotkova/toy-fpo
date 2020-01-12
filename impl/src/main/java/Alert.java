import javax.persistence.*;

@Entity
@Table (name = "alert")
public class Alert {
    @Id
    @Column(name="id")
    private int id;

    public int getId() {
        return id;
    }
}
