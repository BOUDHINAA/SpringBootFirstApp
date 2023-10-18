package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {

    IReservationService iReservationService;

    @GetMapping("findAllReservations")
    List<Reservation> findAll(){
        return iReservationService.findAll();
    }

    @PostMapping("/addReservation")
    Reservation addReservation (@RequestBody Reservation r){
        return iReservationService.addReservation(r);
    }
}
