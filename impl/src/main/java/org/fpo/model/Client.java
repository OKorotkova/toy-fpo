package org.fpo.model;

import javax.persistence.*;

@Entity
@Table (name = "client")
public class Client {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "cnum")
    private String cnum;

    @Column(name="type")
    private boolean type;

    public int getId() {
        return id;
    }

    public String getCnum() {
        return cnum;
    }

    public Client setCnum(String cnum) {
        this.cnum = cnum;
        return this;
    }

    public boolean isType() {
        return type;
    }

    public Client setType(boolean type) {
        this.type = type;
        return this;
    }

}
