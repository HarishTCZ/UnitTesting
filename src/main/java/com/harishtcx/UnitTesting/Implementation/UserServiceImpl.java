package com.harishtcx.UnitTesting.Implementation;

import com.harishtcx.UnitTesting.DTO.UserDTO;
import com.harishtcx.UnitTesting.Entity.User;
import com.harishtcx.UnitTesting.Repository.UserRepository;
import com.harishtcx.UnitTesting.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        User updatedUser = new User();
        updatedUser.setId(user.getId());
        updatedUser.setName(user.getName());
        userRepository.save(updatedUser);
        return updatedUser;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    private UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        return userDTO;
    }
}
