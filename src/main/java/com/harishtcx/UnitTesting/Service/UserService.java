package com.harishtcx.UnitTesting.Service;


import com.harishtcx.UnitTesting.DTO.UserDTO;
import com.harishtcx.UnitTesting.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDTO> getAll();
    Optional<User> getById(Long id);
    User add(User user);
    User update(User user);
    void delete(Long id);
}
