package com.example.springVlmProject.repository;

import com.example.springVlmProject.domain.User;



public interface UserRepository extends Repository<User, Long>{
    @Override
    default Class<User> getClazz(){
        return User.class;
    }
}
