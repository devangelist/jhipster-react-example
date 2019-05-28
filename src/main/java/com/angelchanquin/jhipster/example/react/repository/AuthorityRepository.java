package com.angelchanquin.jhipster.example.react.repository;

import com.angelchanquin.jhipster.example.react.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
