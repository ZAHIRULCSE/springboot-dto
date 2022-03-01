package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
