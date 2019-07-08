package com.bnpp.galaxy.repositories;

import com.bnpp.galaxy.entities.Partnership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PartnershipRepository extends JpaRepository<Partnership, Long> {

    boolean existsByNameAndExecutionLock(String name, String executionLock);

    boolean existsByNameAndExecutionLockNotNull(String name);

    boolean existsByNameAndExecutionLockNull(String name);

    boolean existsByNameAndHold(String name, boolean hold);

    Partnership findByName(String name);

    Collection<Partnership> findAllByExecutionLock(String executionLock);

}
