package eu.cefim.java;

import java.util.ArrayList;
import java.util.List;

public class Client {
  private int id;
   private String mail;
   private String password;
    private Double nbBilletsAchetes;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getNbBilletsAchetes() {
        return nbBilletsAchetes;
    }

    public void setNbBilletsAchetes(Double nbBilletsAchetes) {
        this.nbBilletsAchetes = nbBilletsAchetes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                '}';
    }
}
