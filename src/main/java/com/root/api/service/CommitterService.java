package com.root.api.service;

import com.root.api.model.Committer;
import com.root.api.repository.AboutRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class AboutService {
    private final AboutRepository aboutRepository;
    public Optional<Committer> getByIdCommitter(final Long id){
        return aboutRepository.findById(id);
    }

    public Iterable<Committer> getListCommitter(){
        return aboutRepository.findAll();
    }
    public Committer saveCommitter(Committer committer){
        return aboutRepository.save(committer);
    }
    public Committer updateCommitter(Committer committer){
        return aboutRepository.save(committer);
    }
    public void deleteCommitter(final Long id){
        aboutRepository.deleteById(id);
    }
    public Iterable<Committer> searchCommitter(String keyword){
        return aboutRepository.findByFirstNameContains(keyword);
    }
}
