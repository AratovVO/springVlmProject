package com.example.springVlmProject.services;

import com.example.springVlmProject.domain.Certificate;
import com.example.springVlmProject.repository.CertificateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CertificateService {
    CertificateRepository certificateRepository;

}
