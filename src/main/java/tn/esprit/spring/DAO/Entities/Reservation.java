package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.time.LocalDate;

@Table(name = "Reservation")
@Entity
@Setter
@Getter
public class Reservation {
@Id
private String idReservation;

@Column(name = "anneeUniversitaire")
    private Date anneeUniversitaire;
@Column(name = "estValide")
    private Boolean estValide;
}
