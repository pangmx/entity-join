package springdatajpatest.entityjoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdatajpatest.entityjoin.entity.Message;
import springdatajpatest.entityjoin.entity.Threshold;
import springdatajpatest.entityjoin.repository.MessageRepository;
import springdatajpatest.entityjoin.repository.ThresholdRepository;

@Service
public class TestForeignKeyService {

	
	@Autowired
	private ThresholdRepository thresholdRepo;
	
	@Autowired
	private MessageRepository messageRepo;
	
	
	public void testForeignKeyInsert() {
		Threshold t1 = new Threshold(10);
		Threshold t2 = new Threshold(20);
		thresholdRepo.save(t1);
		thresholdRepo.save(t2);
		
		Message m1 = new Message("message1",new Threshold(t1.getId()));
		Message m2 = new Message("message2",new Threshold(t1.getId()));
		Message m3 = new Message("message3",t2);
		messageRepo.save(m1);
		messageRepo.save(m2);
		messageRepo.save(m3);
		
		System.out.println(messageRepo.findAll().stream().peek(System.out::println).count());
		System.out.println(thresholdRepo.findAll().stream().peek(System.out::println).count());
		
	}
}
