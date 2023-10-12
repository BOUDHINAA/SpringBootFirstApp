package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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

    @OneToOne(cascade = CascadeType.ALL)
    private Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Bloc> blocs;

}
