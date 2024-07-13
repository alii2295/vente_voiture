package org.ali.vente_voiture.controler;

import org.ali.vente_voiture.model.Annonce;
import org.ali.vente_voiture.service.annonceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/annonce")
public class annoncecontroler {
    @Autowired
    private annonceservice as;
    @PostMapping("/ajouter")
    public Annonce create_annonce(@RequestBody Annonce a)
    {
        return as.create_annonce(a);

    }
    @DeleteMapping("/supprimer")
    public void supprimer_annonce(@RequestParam("id_annonce") Long id_annonce)
    {
        as.delete_annonce(id_annonce);
    }
    @PutMapping("/modifier/{id_annonce}")
    public Annonce modifier_annonce(@RequestBody Annonce a,@PathVariable Long id_annonce)
    {
        return as.update_annonce(a,id_annonce);
    }
    @GetMapping("/trouver/{id_annonce}")
    public Annonce trouver_annonce(@PathVariable Long id_annonce)
    {
        return as.find_user(id_annonce);
    }
}

