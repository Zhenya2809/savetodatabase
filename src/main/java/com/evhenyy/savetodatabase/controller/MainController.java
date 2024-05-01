package com.evhenyy.savetodatabase.controller;

import com.evhenyy.savetodatabase.model.Lead;
import com.evhenyy.savetodatabase.repository.LeadRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping(value = "/api")
public class MainController {


    private final LeadRepository leadRepository;

    public MainController(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @PostMapping("/leads")
    public ResponseEntity<String> saveLead(@RequestBody Lead lead) {
        leadRepository.save(lead);
        return ResponseEntity.ok("Lead saved successfully");
    }

}
