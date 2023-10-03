package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}
