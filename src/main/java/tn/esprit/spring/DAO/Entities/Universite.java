package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.security.SecureRandomParameters;

@Table(name = "Universite")
@Entity
@Setter
@Getter
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private long idUniversite;

    @Column(name = "nomUniversite")
    private String nomUniversite;

    @Column(name = "adresse")
    private String adresse;

    @OneToOne()
    private Foyer foyer;

}
