package com.learning.practice.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/net")
public class SocketController {
	
	@Autowired
	private SocketService service;

	@GetMapping("/socket")
	public void sendMessageViaSocket(String msg) {
		service.sendMessage(msg);
	}
}
