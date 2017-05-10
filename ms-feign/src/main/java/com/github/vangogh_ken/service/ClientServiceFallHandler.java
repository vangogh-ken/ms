package com.github.vangogh_ken.service;


import org.springframework.stereotype.Component;

@Component//也需要纳入spring context中
public class ClientServiceFallHandler implements ClientService {

	@Override
	public String echo(String name) {
		// TODO Auto-generated method stub
		return "fall echo";
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "fall test";
	}

}
