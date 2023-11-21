package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.*;
import java.time.LocalDate;

@Table(name = "Reservation")
@Entity
@Setter
@Getter
public class Reservation{
@Id
@Column(name = "idReservation")
private String idReservation;


@Column(name = "anneeUniversitaire")
    private LocalDate anneeUniversitaire;

@Column(name = "estValide")
    private Boolean estValide;

    @ManyToMany()
    private Set<Etudiant> etudiants= new HashSet<>();

    @ManyToOne
    private Chambre chambre;




}
