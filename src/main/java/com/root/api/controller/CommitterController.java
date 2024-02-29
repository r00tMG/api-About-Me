package com.root.api.controller;

import com.root.api.model.Committer;
import com.root.api.service.AboutService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@Data
@RestController
public class AboutController {
    private final AboutService aboutService;
    @PostMapping("committer")
    public ResponseEntity<Committer> create(@RequestBody Committer committer){
        Committer committerSaved=aboutService.saveCommitter(committer);
        return new ResponseEntity<>(committerSaved,HttpStatus.CREATED);
    }
    @GetMapping("committer/{id}")
    public ResponseEntity<Optional<Committer>> readById(@PathVariable("id") final Long id){
        Optional<Committer> committerOptional=aboutService.getByIdCommitter(id);
        return new ResponseEntity<>(committerOptional,HttpStatus.OK);
    }
    @GetMapping("committer")
    public ResponseEntity<Iterable<Committer>> read(){
        Iterable<Committer> committerIterable=aboutService.getListCommitter();
        return new ResponseEntity<>(committerIterable,HttpStatus.OK);
    }
    @PutMapping("committer/{id}")
    public Committer update(@PathVariable("id") final Long id, @RequestBody Committer committer) {
        Optional<Committer> e = aboutService.getByIdCommitter(id);
        if(e.isPresent()) {
            Committer currentCommitter = e.get();

            String firstName = committer.getFirstName();
            if(firstName != null) {
                currentCommitter.setFirstName(firstName);
            }
            String lastName = committer.getLastName();
            if(lastName != null) {
                currentCommitter.setLastName(lastName);;
            }
            String email = committer.getEmail();
            if(email != null) {
                currentCommitter.setEmail(email);
            }
            String tel = committer.getTel();
            if(tel != null) {
                currentCommitter.setTel(tel);;
            }
            aboutService.saveCommitter(currentCommitter);
            return currentCommitter;
        } else {
            return null;
        }
    }
    @DeleteMapping("committer/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final Long id){
        aboutService.deleteCommitter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("committer/{keyword}")
    public ResponseEntity<Iterable<Committer>> search(@RequestParam("keyword") String keyword){
        Iterable<Committer> searchedString = aboutService.searchCommitter(keyword);
        return new ResponseEntity<>(searchedString,HttpStatus.OK);
    }






}
