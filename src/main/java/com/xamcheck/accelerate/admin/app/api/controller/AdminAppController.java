package com.xamcheck.accelerate.admin.app.api.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xamcheck.accelerate.admin.app.api.dto.ResponceDto;


@RestController
@RequestMapping("/admin")
public class AdminAppController {
	@Value("${eureka.client.register-with-eureka}")
    private String eureka;
	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto = new ResponceDto();
		responceDto.setMessage("Just test the Admin App Ends Points");
		return responceDto;

	}

}
