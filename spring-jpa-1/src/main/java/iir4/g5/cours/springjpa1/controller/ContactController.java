package iir4.g5.cours.springjpa1.controller;

import iir4.g5.cours.springjpa1.model.Contact;
import iir4.g5.cours.springjpa1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Contacts")
public class ContactController {

    @Autowired
    ContactRepository ContactRepository;

    @GetMapping("/all")
    public List<Contact> get(){
        return ContactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contact get(@PathVariable int id){
        return ContactRepository.findById(id).get();
    }
    @GetMapping("/telephone")
    public ResponseEntity<List<Contact>> findByTelephone(@RequestParam  String telephone){
        return new ResponseEntity<>(ContactRepository.findByTelephone(telephone), HttpStatus.OK);
    }
    @GetMapping("/nom")
    public ResponseEntity<List<Contact>> findByName(@RequestParam  String nom){
        return new ResponseEntity<>(ContactRepository.findByName(nom), HttpStatus.OK);
    }

    @PostMapping("/add")
    public Contact ajouter(@RequestBody Contact u){
       ContactRepository.save(u);
       return ContactRepository.findByTelephone(u.getTelephone()).get(0);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        ContactRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody Contact Contact) {
        Contact u = ContactRepository.findById(Contact.getId()).get();
        u.setNom(Contact.getNom());
        u.setTelephone(Contact.getTelephone());
        u.setCountryCode(Contact.getCountryCode());
        u.setEmail(Contact.getEmail());
    }

}
