package com.demo.data;

import com.demo.model.Starbucks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface StarbucksRepository extends JpaRepository<Starbucks, Long> {
}
