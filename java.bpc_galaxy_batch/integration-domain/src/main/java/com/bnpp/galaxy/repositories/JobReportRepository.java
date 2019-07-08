package com.bnpp.galaxy.repositories;

import com.bnpp.galaxy.entities.JobReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobReportRepository extends JpaRepository<JobReport, Long> {

}
