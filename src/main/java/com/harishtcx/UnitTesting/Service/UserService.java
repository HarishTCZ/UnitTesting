package com.harishtcx.UnitTesting.Service;


import com.harishtcx.UnitTesting.DTO.UserDTO;
import com.harishtcx.UnitTesting.Entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();
    User add(User user);
    User update(User user);
    void delete(Long id);
}
