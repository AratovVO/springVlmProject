package com.example.springVlmProject.repository;

import com.example.springVlmProject.domain.Certificate;

public interface CertificateRepository extends Repository<Certificate, Long>{
    @Override
    default Class<Certificate> getClazz(){
        return Certificate.class;
    }
}
