package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name = "chambre")
@Entity
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Chambre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

@Column(name = "numeChambre")
    private long numChambre;
@Column(name="typeC")
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    public Chambre() {

    }
}
