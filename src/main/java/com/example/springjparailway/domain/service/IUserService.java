package com.example.springjparailway.domain.service;

import com.example.springjparailway.domain.model.User;

public interface IUserService {
    User findById(Long id);
    User create(User userToCreate);
}
