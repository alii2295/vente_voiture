package org.ali.vente_voiture.service;

import org.ali.vente_voiture.model.User;
import org.ali.vente_voiture.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class userservice {
    @Autowired
    private Userrepository ur;
    public User create_user(User u)
    {
        return ur.save(u);
    }
    public void delete_user(Long id_user)
    {
        ur.deleteById(id_user);
    }
    public User update_user(User u, Long id_user)
    {
        boolean exists = ur.existsById(id_user);
        if (exists)
        {

            Optional<User> utilisateur = ur.findById(id_user);
            User utilis = utilisateur.get();
            utilis.setPseudo(u.getPseudo());
            utilis.setMail(u.getMail());
            utilis.setPassword(u.getPassword());
            utilis.setRole(u.getRole());
            return ur.save(utilis);
        }
        else
        {
            return null;
        }
    }
    public User find_user(Long id_user)
    {
        return ur.findById(id_user).orElse(null);
    }



}
