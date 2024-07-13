package org.ali.vente_voiture.service;

import org.ali.vente_voiture.model.Annonce;
import org.ali.vente_voiture.repository.Annoncerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class annonceservice {
    @Autowired
    private Annoncerepository ar;
    public Annonce create_annonce(Annonce u)
    {
        return ar.save(u);
    }
    public void delete_annonce(Long id_user)
    {
        ar.deleteById(id_user);
    }
    public Annonce update_annonce(Annonce u, Long id_annonce)
    {
        boolean exists = ar.existsById(id_annonce);
        if (exists)
        {

            Optional<Annonce> annonce =ar.findById(id_annonce);
            Annonce annon = annonce.get();
            annon.setModel(u.getModel());
            annon.setMatricule(u.getMatricule());
            annon.setKilometrage(u.getKilometrage());
            annon.setCarburant(u.getCarburant());
            return ar.save(annon);
        }
        else
        {
            return null;
        }
    }
    public Annonce find_user(Long id_annonce)
    {
        return ar.findById(id_annonce).orElse(null);
    }





}
