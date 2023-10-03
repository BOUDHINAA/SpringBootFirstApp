package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Bloc")
@Entity
@Setter
@Getter
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    @Column (name="nomBloc")
    private String nomBloc;
    @Column(name = "capaciteBloc")
    private long capacite;

}
