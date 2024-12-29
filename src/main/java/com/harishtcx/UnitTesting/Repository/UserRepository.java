package com.harishtcx.UnitTesting.Repository;

import com.harishtcx.UnitTesting.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
