package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="Foyer")
@Entity
@Setter
@Getter
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    @Column(name = "nomFoyer")
    private String nom;

    @Column(name = "capaciteFoyer")
    private long capacite;



}
