package com.simec.requisiciones.entities.Commentary;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentaryService {
    
    @Autowired
    private CommentaryRepository commentaryRepository;
    
    public List<Commentary> getAllCommentaries() {
        return commentaryRepository.findAll();
    }
    
    public Optional<Commentary> getCommentaryById(Long id) {
        return commentaryRepository.findById(id);
    }
    
    public Commentary saveCommentary(Commentary commentary) {
        return commentaryRepository.save(commentary);
    }
    
    public Commentary updateCommentary(Long id, Commentary commentary) {
        if (commentaryRepository.existsById(id)) {
            return commentaryRepository.save(commentary);
        }
        return null;
    }
    
    public boolean deleteCommentary(Long id) {
        if (commentaryRepository.existsById(id)) {
            commentaryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
