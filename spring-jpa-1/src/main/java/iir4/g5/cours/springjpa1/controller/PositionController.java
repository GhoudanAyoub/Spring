package iir4.g5.cours.springjpa1.controller;

import iir4.g5.cours.springjpa1.model.Position;
import iir4.g5.cours.springjpa1.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Position")
public class PositionController {

    @Autowired
    PositionRepository PositionRepository;

    @GetMapping("/all")
    public List<Position> get(){
        return PositionRepository.findAll();
    }

    @GetMapping("/imei")
    public Position getPositionByImei(@RequestParam String imei){

        Position positionByImei = PositionRepository.getPositionByImei(imei);
        if(positionByImei==null)
        return new Position();
        else return positionByImei;
    }

    @GetMapping("/{id}")
    public Position get(@PathVariable int id){
        return PositionRepository.findById(id).get();
    }

    @PostMapping("/add")
    public Position ajouter(@RequestBody Position u){
        PositionRepository.save(u);
        return PositionRepository.findById(u.getId()).get();
    }

    @DeleteMapping("/{id}")
    public void suppr(@PathVariable int id){
        PositionRepository.deleteById(id);
    }

    @PutMapping("/update")
    public Position modif(@RequestBody Position Position) {
        Position u = PositionRepository.findById(Position.getId()).get();
        u.setLatitude(Position.getLatitude());
        u.setLongitude(Position.getLongitude());
        u.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        PositionRepository.save(u);
        return u;
    }

}