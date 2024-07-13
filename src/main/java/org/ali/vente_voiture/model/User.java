package org.ali.vente_voiture.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String pseudo;
    private String password;
    @Email
    private String mail;
    public Role role;
    @OneToMany(mappedBy = "user")
    private List<Annonce> annonces;




}
