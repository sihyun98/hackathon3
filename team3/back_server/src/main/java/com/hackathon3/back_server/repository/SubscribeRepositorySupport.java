package com.hackathon3.back_server.repository;

import static com.hackathon3.back_server.domain.QStock.stock;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.domain.Subscribe;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.hackathon3.back_server.domain.QSubscribe.subscribe;

@Repository
public class SubscribeRepositorySupport extends QuerydslRepositorySupport {

private final JPAQueryFactory queryFactory;
	
	public SubscribeRepositorySupport(JPAQueryFactory queryFactory) {
		super(Subscribe.class);
		this.queryFactory = queryFactory;
	}
	
	public List<Subscribe> likes(Member member){
		
		return queryFactory.selectFrom(subscribe)
				.where(subscribe.member.eq(member))
				.fetch();
	}
	
}
