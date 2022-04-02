package iir4.g5.cours.springjpa1.controller;

import iir4.g5.cours.springjpa1.model.Position;
import iir4.g5.cours.springjpa1.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Position")
public class PositionController {

    @Autowired
    PositionRepository PositionRepository;

    @GetMapping
    public List<Position> get(){
        return PositionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Position get(@PathVariable int id){
        return PositionRepository.findById(id).get();
    }

    @PostMapping
    public void ajouter(@RequestBody Position u){
        PositionRepository.save(u);
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        PositionRepository.deleteById(id);
    }

    @PutMapping
    public void modif(@RequestBody Position Position) {
        Position u = PositionRepository.findById(Position.getId()).get();
        u.setLatitude(Position.getLatitude());
        u.setLongitude(Position.getLongitude());
    }

}