package com.hackathon3.back_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.back_server.dto.member.MemberSaveRequestDto;
import com.hackathon3.back_server.dto.member.MemberSaveResponseDto;
import com.hackathon3.back_server.dto.stock.StockSearchResponseDto;
import com.hackathon3.back_server.dto.subscribe.SubscribeSaveRequestDto;
import com.hackathon3.back_server.dto.subscribe.SubscribeSaveResponseDto;
import com.hackathon3.back_server.dto.subscribe.SubscribeSearchResponseDto;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.service.StockService;
import com.hackathon3.back_server.service.SubscribeService;

@RestController
public class SubscribeController {
	
	private final SubscribeService subscribeService;
	
	SubscribeController(SubscribeService subscribeService){
		this.subscribeService = subscribeService;
	}
	
	// CREATE
	@PostMapping("/api/subscribe")
	public SubscribeSaveResponseDto save(@RequestBody SubscribeSaveRequestDto requestDto) {
		return subscribeService.save(requestDto);
	}
	
	// SEARCH
	@GetMapping("/api/subscribe/all")
	public List<SubscribeSearchResponseDto> search(){
		return subscribeService.search();
	}

}
