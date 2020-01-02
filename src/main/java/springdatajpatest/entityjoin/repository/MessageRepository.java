package springdatajpatest.entityjoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springdatajpatest.entityjoin.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
