package com.xamcheck.accelerate.admin.app.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamcheck.accelerate.admin.app.api.dto.ResponceDto;
import com.xamcheck.accelerate.admin.app.api.services.AdminAppService;



@RestController
@RequestMapping("/admin")
public class AdminAppController {
	@Autowired AdminAppService adminAppService;	

	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto=new ResponceDto();
		responceDto =adminAppService.checkServicecall();
		responceDto.setMessage("Just test the Admin App Ends Points");
		return responceDto;
		
	}

}
