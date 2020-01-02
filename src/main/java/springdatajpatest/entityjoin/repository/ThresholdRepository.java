package springdatajpatest.entityjoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springdatajpatest.entityjoin.entity.Threshold;

public interface ThresholdRepository extends JpaRepository<Threshold, Long> {

}
