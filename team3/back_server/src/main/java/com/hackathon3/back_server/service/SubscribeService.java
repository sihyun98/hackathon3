package com.hackathon3.back_server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.domain.Subscribe;
import com.hackathon3.back_server.dto.member.MemberSearchResponseDto;
import com.hackathon3.back_server.dto.stock.StockSearchResponseDto;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.repository.StockRepositorySupport;
import com.hackathon3.back_server.repository.SubscribeRepositorySupport;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubscribeService {
	
	private final MemberRepository memberRepository;
	private final SubscribeRepositorySupport subscribeRepositorySupport;
	private final MemberService memberService;
	
	// GET - 구독자 정보 가져오기
	@Transactional(readOnly = true)
	public List<MemberSearchResponseDto> likes(Long id) {
		
		Member member = memberRepository.findById(id).get();
		List<MemberSearchResponseDto> subscribeSearchResponseDto = new ArrayList<MemberSearchResponseDto>();
		
		if(member != null) {
			
			List<Subscribe> subscribers = subscribeRepositorySupport.likes(member);
			
			for(Subscribe subscriber : subscribers) {
				
				MemberSearchResponseDto dto = new MemberSearchResponseDto();
				
				dto = memberService.searchMember(subscriber.getSubscriber_id());
//				subscriber.getSubscriber_id();
				
//				dto.setId(subscriber.getId());
//				dto.setBalanceNo(subscriber.getBalanceNo());
//				dto.setFirmNm(subscriber.getFirmNm());
//				dto.setStockNm(subscriber.getStockNm());
//				dto.setQty(subscriber.getQty());
//				dto.setValTrade(subscriber.getValTrade());
//				dto.setEarningRate(subscriber.getEarningRate());
//				dto.setAssertType(subscriber.getAssertType());
//				dto.setIsuKorNm(subscriber.getIsuKorNm());
//				dto.setIsuSrtCd(subscriber.getIsuSrtCd());
				
				subscribeSearchResponseDto.add(dto);
			}
		}
		
		return subscribeSearchResponseDto;
	}

}
