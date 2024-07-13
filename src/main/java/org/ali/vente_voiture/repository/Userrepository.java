package org.ali.vente_voiture.repository;
import org.ali.vente_voiture.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Userrepository extends JpaRepository<User, Long> {
}
