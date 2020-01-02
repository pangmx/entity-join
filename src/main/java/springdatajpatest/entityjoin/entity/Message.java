package springdatajpatest.entityjoin.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String content;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="threshold_id")
	private Threshold threshold;

	public Message() {}
	
	public Message(String content, Threshold threshold) {
		super();
		this.content = content;
		this.threshold = threshold;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Threshold getThreshold() {
		return threshold;
	}

	public void setThreshold(Threshold threshold) {
		this.threshold = threshold;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", threshold=" + threshold + "]";
	}
	
	
}
