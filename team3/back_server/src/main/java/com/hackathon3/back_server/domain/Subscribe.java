package com.hackathon3.back_server.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Subscribe {
	
	private @Id @GeneratedValue @Column(name = "subscribe_id") Long id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "member_id")	
//	private Member member;
	
	private Long my_id;
	private Long subscriber_id;

	@Override
	public String toString() {
	    return "Subscribe{" + "id=" + this.id + ", subscriber_id='" + this.subscriber_id + '\'' + '}';
	}
}
