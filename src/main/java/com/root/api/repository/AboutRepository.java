package com.root.api.repository;

import com.root.api.model.Committer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AboutRepository extends JpaRepository<Committer,Long>{

}
