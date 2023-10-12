package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Table(name = "Bloc")
@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    @Column(name = "nomBloc")
    private String nomBloc;
    @Column(name = "capaciteBloc")
    private long capacite;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Chambre> chambres;

    public Bloc() {
    }

}
