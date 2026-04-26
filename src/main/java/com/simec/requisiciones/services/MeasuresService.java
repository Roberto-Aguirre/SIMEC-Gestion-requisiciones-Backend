package com.simec.requisiciones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simec.requisiciones.entities.Measures.Measures;
import com.simec.requisiciones.repositories.MeasuresRepository;

@Service
public class MeasuresService {
    
    @Autowired
    private MeasuresRepository measuresRepository;
    
    public List<Measures> getAllMeasures() {
        return measuresRepository.findAll();
    }
    
    public Optional<Measures> getMeasuresById(Long id) {
        return measuresRepository.findById(id);
    }
    
    public Measures saveMeasures(Measures measures) {
        return measuresRepository.save(measures);
    }
    
    public Measures updateMeasures(Long id, Measures measures) {
        if (measuresRepository.existsById(id)) {
            return measuresRepository.save(measures);
        }
        return null;
    }
    
    public boolean deleteMeasures(Long id) {
        if (measuresRepository.existsById(id)) {
            measuresRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
