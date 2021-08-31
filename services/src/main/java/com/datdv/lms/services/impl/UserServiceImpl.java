package com.datdv.lms.services.impl;

import com.datdv.lms.domains.dto.UserDTO;
import com.datdv.lms.domains.entity.UserEntity;
import com.datdv.lms.repository.UserRepository;
import com.datdv.lms.services.UserService;
import com.datdv.lms.utils.convert.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        UserEntity result = userRepository.save(Converter.toModel(user , UserEntity.class));
        return Converter.toModel(result , UserDTO.class);
    }
}
