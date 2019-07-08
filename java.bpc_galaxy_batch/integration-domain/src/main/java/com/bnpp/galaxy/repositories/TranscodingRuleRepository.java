package com.bnpp.galaxy.repositories;

import com.bnpp.galaxy.entities.TranscodingRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscodingRuleRepository extends JpaRepository<TranscodingRule, Long> {

    TranscodingRule findBySource(String source);

}
