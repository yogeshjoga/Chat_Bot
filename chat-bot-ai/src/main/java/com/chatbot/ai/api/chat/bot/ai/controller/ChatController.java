package com.chatbot.ai.api.chat.bot.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.ai.api.chat.bot.ai.model.ChatModel;
import com.chatbot.ai.api.chat.bot.ai.repo.ChatRepo;

@RestController
public class ChatController {
	
	@Autowired
	ChatRepo chatRepo;
	
	
	@GetMapping("/hello")
	public String answer() {
		
		return "answer";
	}
	
	@PostMapping("/save")
	public String question(@RequestBody ChatModel chatModel) {
		chatRepo.save(chatModel);
		
		return "Chat entity is succesfully saved into db";
	}

}
