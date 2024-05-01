package com.evhenyy.savetodatabase.repository;

import com.evhenyy.savetodatabase.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {
}
