package com.jkkscent.backend.repository;


import com.jkkscent.backend.domain.Scent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScentRepository extends JpaRepository<Scent, Long> {

    public List<Scent> findByName(String name);


}
