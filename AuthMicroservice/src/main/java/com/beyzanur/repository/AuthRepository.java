package com.beyzanur.repository;

import com.beyzanur.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth,Long> {
}
