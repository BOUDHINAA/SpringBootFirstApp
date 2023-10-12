package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name = "chambre")
@Entity
@Setter
@Getter
public class Chambre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

@Column(name = "numeroChambre")
    private long numChambre;
@Column(name="TypeC")
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
