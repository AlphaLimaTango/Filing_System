package com.codeclan.filingsystem.FilingSystem.repositories;

import com.codeclan.filingsystem.FilingSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
