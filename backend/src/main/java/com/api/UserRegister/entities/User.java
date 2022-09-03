package com.api.UserRegister.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_User")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String tipo;
    @Column
    private Boolean status;

    public User(){

    }

    public User(UUID id, String name, String email, String tipo, Boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tipo = tipo;
        this.status = status;
    }

}
