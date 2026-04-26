package com.simec.requisiciones.entities.Commentary;

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

import com.simec.requisiciones.dtos.Commentary.CommentaryDTO;

@RestController
@RequestMapping("/api/commentaries")
public class CommentaryController {
    
    @Autowired
    private CommentaryService commentaryService;
    
    @GetMapping
    public ResponseEntity<List<Commentary>> getAllCommentaries() {
        List<Commentary> commentaries = commentaryService.getAllCommentaries();
        return new ResponseEntity<>(commentaries, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Commentary> getCommentaryById(@PathVariable Long id) {
        Optional<Commentary> commentary = commentaryService.getCommentaryById(id);
        return commentary.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<Commentary> createCommentary(@RequestBody CommentaryDTO commentarydtoin) {
        Commentary commentaryIn = Commentary.builder()
                .comment(commentarydtoin.getComment())
                .build();
        Commentary savedCommentary = commentaryService.saveCommentary(commentaryIn);

        return new ResponseEntity<>(savedCommentary, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Commentary> updateCommentary(@PathVariable Long id, @RequestBody Commentary commentary) {
        Commentary updatedCommentary = commentaryService.updateCommentary(id, commentary);
        if (updatedCommentary != null) {
            return new ResponseEntity<>(updatedCommentary, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommentary(@PathVariable Long id) {
        if (commentaryService.deleteCommentary(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
