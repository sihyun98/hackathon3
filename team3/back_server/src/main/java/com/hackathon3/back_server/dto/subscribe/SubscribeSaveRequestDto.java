package com.hackathon3.back_server.dto.subscribe;

import com.hackathon3.back_server.domain.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class SubscribeSaveRequestDto {
	
	private Long id;
	
	private Long my_id;
	private Long subscriber_id;

}
