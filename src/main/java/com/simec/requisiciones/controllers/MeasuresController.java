package com.simec.requisiciones.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simec.requisiciones.entities.Measures.Measures;
import com.simec.requisiciones.services.MeasuresService;

@RestController
@RequestMapping("measures")
public class MeasuresController {
    
    @Autowired
    private MeasuresService measuresService;
    
    @GetMapping
    public ResponseEntity<List<Measures>> getAllMeasures() {
        List<Measures> measures = measuresService.getAllMeasures();
        return new ResponseEntity<>(measures, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Measures> getMeasuresById(@PathVariable Long id) {
        Optional<Measures> measures = measuresService.getMeasuresById(id);
        return measures.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<Measures> createMeasures(@RequestBody Measures measures) {
        Measures savedMeasures = measuresService.saveMeasures(measures);
        return new ResponseEntity<>(savedMeasures, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Measures> updateMeasures(@PathVariable Long id, @RequestBody Measures measures) {
        Measures updatedMeasures = measuresService.updateMeasures(id, measures);
        if (updatedMeasures != null) {
            return new ResponseEntity<>(updatedMeasures, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeasures(@PathVariable Long id) {
        if (measuresService.deleteMeasures(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
