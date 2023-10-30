package com.example.demo.models;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_USER")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    String name;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public UUID getUserId() {
        return userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
