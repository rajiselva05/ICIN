package com.icinbank.onlinebanking.Repository;

import com.icinbank.onlinebanking.Security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}