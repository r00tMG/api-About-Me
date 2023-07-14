package com.root.api.service;

import com.root.api.model.Committer;
import com.root.api.repository.AboutRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AboutService {
    private final AboutRepository aboutRepository;

    public List<Committer> getListCommitter(){
        return aboutRepository.findAll();
    }
    public Committer saveCommitter(Committer committer){
        return aboutRepository.save(committer);
    }
}
