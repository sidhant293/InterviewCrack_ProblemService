package com.interviewcrack.problemservice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interviewcrack.problemservice.dto.TokenRequestDTO;
import com.interviewcrack.problemservice.dto.TokenResponseDTO;
import com.interviewcrack.problemservice.exception.ProxyException;
import com.interviewcrack.problemservice.proxy.TokenProxy;

@Aspect
@Component
public class TokenValidator {

	@Autowired
	private TokenProxy tokenProxy;
	
	@Before(value = "execution(* com.interviewcrack.problemservice.secure.api.*.*(..))")
	public void validateAccessToken(JoinPoint joinPoint) throws Exception {
		System.out.println("VALIDATOR Started");
//		tokenProxy.validateAccess(null);
		String token="";
		Object[] arguments=joinPoint.getArgs();
		
		for(Object obj:arguments) {
			String s=(String)obj;
			if(s.contains("Bearer")) {
				token=s;
				break;
			}
		}
		
		if(token.length()==0) throw new ProxyException("ProxyException: Auth token not found");
		
		int indx=token.indexOf("Bearer");
		token=token.substring(indx+7); //bearer(6)+space(1)
		
		TokenRequestDTO tokenDTO=new TokenRequestDTO();
		tokenDTO.setAccess(token);
		
		TokenResponseDTO response;
		
		try {
			response=tokenProxy.validateAccess(tokenDTO);
		}catch(Exception e) {
			System.out.println("Error Message: "+e.getMessage());
			throw new ProxyException("Proxy Exception Token Invalid");
		}
		
		System.out.print("response: "+response.toString());
	}
}
