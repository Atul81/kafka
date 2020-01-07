package atul.poc.kafkalogs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atul.poc.kafkalogs.entity.LogInsertion;

@Repository
public interface LogInsertionRepository extends JpaRepository<LogInsertion, Long>
{
}
