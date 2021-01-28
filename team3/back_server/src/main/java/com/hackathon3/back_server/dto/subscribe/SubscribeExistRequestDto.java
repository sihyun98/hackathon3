package com.hackathon3.back_server.dto.subscribe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class SubscribeExistRequestDto {
	
	private Long my_id;
	private Long subscriber_id;

}
