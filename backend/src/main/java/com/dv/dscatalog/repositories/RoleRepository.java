package com.dv.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dv.dscatalog.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByAuthority(String authority);
}
