package ru.alexkulikov;

import javax.persistence.*;

@Entity
@Table(name = "values")
public class SomeEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "value")
    private String value;

    public SomeEntity() {
    }

    public SomeEntity(String value) {
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
