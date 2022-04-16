package com.example.demo.controller;

import com.example.demo.model.Machine;
import com.example.demo.repository.MachineRepository;
import com.example.demo.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("machines")
public class MachineController {
    @Autowired
    private MachineRepository machineRepository;

    @Autowired
    private MarqueRepository marqueRepository;

    @PostMapping("/save")
    public void save(@RequestBody Machine machine) {
        System.out.println(machine);

        machine.setMarque(marqueRepository.findById(machine.getMarque().getId()));

        machineRepository.save(machine);
    }

    @GetMapping("/all")
    public List<Machine> findAll() {
        return machineRepository.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(required = true) int id) {
        System.out.println("id = " + id);
        Machine machine = machineRepository.findById((id));
        machineRepository.delete(machine);
    }

    @GetMapping(value = "/byYear")
    public Collection<?> findByYear() {
        return machineRepository.findByMachinesYear();
    }

    @GetMapping(value = "/byMarque")
    public Collection<Map<String, String>> findByMarque() {
        return machineRepository.findByMachinesMarque();
    }

    @GetMapping(value = "/byYearApi")
    public Collection<Map<String, String>> findByMachinesYearApi() {
        return machineRepository.findByMachinesYearApi();
    }

}
