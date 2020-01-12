import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "rule_configuration")
public class RuleConfiguration {
    @Id
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }
}
