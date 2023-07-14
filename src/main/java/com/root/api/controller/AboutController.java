package com.root.api.controller;

import com.root.api.model.Committer;
import com.root.api.service.AboutService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@CrossOrigin(origins = "*")
public class AboutController {
    private final AboutService aboutService;

    @GetMapping("/read")
    public ResponseEntity<List<Committer>> getAllCommitter(){
        List<Committer> committerList=aboutService.getListCommitter();
        return new ResponseEntity<>(committerList,HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Committer> saveCommitter(@RequestBody Committer committer){
        Committer committerSaved=aboutService.saveCommitter(committer);
        return new ResponseEntity<>(committerSaved,HttpStatus.CREATED);
    }
}
