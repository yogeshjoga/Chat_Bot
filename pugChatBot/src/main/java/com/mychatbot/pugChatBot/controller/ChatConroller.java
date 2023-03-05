package com.mychatbot.pugChatBot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mychatbot.pugChatBot.repo.ChatDb;
import com.mychatbot.pugChatBot.repo.ChatMessage;
import com.mychatbot.pugChatBot.repo.ChatResponce;
import com.mychatbot.pugChatBot.service.ChatBotService;

@RestController
public class ChatConroller {
	//@Qualifier("ChatMessage")
	//@Autowired
	ChatBotService chatBotService = new ChatBotService();
	@Autowired
	ChatDb chatDb;

	@PostMapping("/chat")
	public ChatResponce handleMessage(@RequestBody ChatMessage message) {
		
		// Converted into ChatMessage object to String
		String responce = chatBotService.chatResponce(message.getQuestion().toLowerCase());
		return new ChatResponce(responce);
	}

	@GetMapping("/chat")
	public String showChatPage() {
		return "html";
	}
	
	@PostMapping("/savenewquestion")
	public String saveNewQuestion(@RequestBody ChatMessage chatMessage ) {
		chatDb.save(chatMessage);
		return "Your question and answer is succesfully added into db";
	} 
	
}
