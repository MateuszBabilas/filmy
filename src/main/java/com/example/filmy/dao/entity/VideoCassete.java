package com.example.filmy.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class VideoCassete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    public long id;
    public String tytul;
    public LocalDate rokProdukcji;

    public VideoCassete(long id, String tytul, LocalDate rokProdukcji) {
        this.id = id;
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
    }

    public VideoCassete() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public long getId() {
        return id;
    }

    public String getTytul() {
        return tytul;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
}
