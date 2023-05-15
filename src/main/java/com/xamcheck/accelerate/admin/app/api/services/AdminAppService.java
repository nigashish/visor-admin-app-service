package com.xamcheck.accelerate.admin.app.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xamcheck.accelerate.admin.app.api.dto.ResponceDto;
import com.xamcheck.accelerate.admin.app.api.repository.AdminAppRespository;

@Service
public class AdminAppService {
	@Autowired AdminAppRespository adminAppRespository;
	private @Autowired RestTemplate restTemplate;

	public ResponceDto checkServicecall() {
		ResponceDto responceDto=new ResponceDto();
		return null;
	}	
}
