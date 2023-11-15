package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Table(name = "chambre")
@Entity
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private long idChambre;

    @Column(name = "numeChambre")
    private long numChambre;
    @Column(name="typeC")
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;

    @OneToMany()
    private Set<Reservation> reservations;
    public Chambre() {

    }
}
