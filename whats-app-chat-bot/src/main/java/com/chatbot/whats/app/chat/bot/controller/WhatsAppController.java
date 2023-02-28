package com.chatbot.whats.app.chat.bot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chatbot.whats.app.chat.bot.model.WhatsAppModel;
import com.chatbot.whats.app.chat.bot.repo.WhatsAppRepo;


@Controller
public class WhatsAppController {
	
	@Autowired
	WhatsAppRepo whatsAppRepo;
	
	//  /whatsapp.api/save-question
	@PostMapping("/save")
	public String saveQuestion(@RequestBody WhatsAppModel whatsAppModel) {
		whatsAppRepo.save(whatsAppModel);
		System.out.println("saved the question into db njoy");
		return "index.html";
	}
	
	
	@GetMapping("/get")
	public List<WhatsAppModel> getAllQuestions(){
		
		return whatsAppRepo.findAll();
	}
	
	@GetMapping("/gethtml")
	public String getHtml(){
		
		return "index";
	}
	
	@RequestMapping("/html")
	public String html() {
		return "index1";
	}
  
}
