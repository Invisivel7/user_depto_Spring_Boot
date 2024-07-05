package com.departament.userdepto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.departament.userdepto.entities.user;

public interface UserRepository extends JpaRepository<user, Long> {
	

}
