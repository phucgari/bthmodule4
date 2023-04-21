package com.thithuchanh4.repository;

import com.thithuchanh4.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INationRepository extends JpaRepository<Nation,Long> {
}
