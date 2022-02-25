package com.interviewcrack.problemservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.interviewcrack.problemservice.dto.TokenRequestDTO;
import com.interviewcrack.problemservice.dto.TokenResponseDTO;

@FeignClient(url="${auth-service}",name="token-proxy")
public interface TokenProxy {

	@PostMapping("/validate/token")
	public TokenResponseDTO validateAccess(@RequestBody TokenRequestDTO token);
}
