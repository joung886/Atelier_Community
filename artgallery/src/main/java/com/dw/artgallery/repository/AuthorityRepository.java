package com.dw.artgallery.repository;

import com.dw.artgallery.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByAuthorityName(String authorityName);
}
