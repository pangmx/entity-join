package springdatajpatest.entityjoin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Threshold {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private int thresholdPercentage;

	public Threshold() {}
	
	public Threshold(long id) {
		this.id = id;
	}
	
	public Threshold(int thresholdPercentage) {
		super();
		this.thresholdPercentage = thresholdPercentage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getThresholdPercentage() {
		return thresholdPercentage;
	}

	public void setThresholdPercentage(int thresholdPercentage) {
		this.thresholdPercentage = thresholdPercentage;
	}

	@Override
	public String toString() {
		return "Threshold [id=" + id + ", thresholdPercentage=" + thresholdPercentage + "]";
	}
	
	
}
