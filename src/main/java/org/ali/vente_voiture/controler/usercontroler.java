package org.ali.vente_voiture.controler;

import org.ali.vente_voiture.model.User;
import org.ali.vente_voiture.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class usercontroler {
    @Autowired
    private userservice us;
    @PostMapping("/ajouter")
    public User create_user(@RequestBody User u)
    {
        return us.create_user(u);

    }
    @DeleteMapping("/supprimer")
    public void supprimer_user(@RequestParam("id_userr") Long id_userr)
    {
        us.delete_user(id_userr);
    }
    @PutMapping("/modifier/{id_user}")
    public User modifier_user(@RequestBody User u,@PathVariable Long id_user)
    {
        return us.update_user(u,id_user);
    }
    @GetMapping("/trouver/{id_user}")
    public User trouver_user(@PathVariable Long id_user)
    {
        return us.find_user(id_user);
    }
}
