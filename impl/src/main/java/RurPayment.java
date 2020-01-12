import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "rur_payment")
public class RurPayment {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "summ_transaction")
    private int summTransaction;

    @Column(name = "rec_cnum")
    private String rec_cnum;

    @Column(name = "dest_cnum")
    private String dest_cnum;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public RurPayment setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getSummTransaction() {
        return summTransaction;
    }

    public RurPayment setSummTransaction(int summTransaction) {
        this.summTransaction = summTransaction;
        return this;
    }

    public String getRec_cnum() {
        return rec_cnum;
    }

    public RurPayment setRec_cnum(String rec_cnum) {
        this.rec_cnum = rec_cnum;
        return this;
    }

    public String getDest_cnum() {
        return dest_cnum;
    }

    public RurPayment setDest_cnum(String dest_cnum) {
        this.dest_cnum = dest_cnum;
        return this;
    }
}
