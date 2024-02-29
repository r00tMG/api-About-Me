package com.root.api.repository;

import com.root.api.model.Committer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<Committer,Long>{

    Iterable<Committer> findByFirstNameContains(String keyword);
}
