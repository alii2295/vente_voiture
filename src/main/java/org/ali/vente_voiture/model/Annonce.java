package org.ali.vente_voiture.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_annonce;
    private String model ;
    private String matricule;
    private long kilometrage;
    private Carburant carburant;
    //private photo photo
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
