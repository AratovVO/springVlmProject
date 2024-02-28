package com.example.springVlmProject.controller;

import com.example.springVlmProject.domain.Certificate;
import com.example.springVlmProject.repository.CertificateRepository;
import com.example.springVlmProject.repository.Repository;
import com.example.springVlmProject.services.CertificateService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CertificateController extends AbstractController<Certificate>{
    CertificateService service;

    public CertificateController(CertificateRepository repository, CertificateService service) {
        super(repository);
        this.service = service;
    }
}
