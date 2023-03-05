package com.mychatbot.pugChatBot.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.mychatbot.pugChatBot.repo.ChatDb;


public class ChatBotService {

	@Autowired
	ChatDb chatDb;
	@Autowired
	ChatBotService chatBotService;

	public String chatResponce(String question) {

		String message = "";
		String responce ;

		if (question.contains("hello") || question.contains("hi")) {
			return message = "how are you man im good";
		}

		/*
		 * lets prepare the query to get answers flow the rules get the Question from
		 * Controller class --Question to convert to key --By using the key to search
		 * into the DB and get the responce from the db --Responce to fetch into the
		 * answer......
		 */
		else {
	    	responce = chatDb.findById(question).toString();
		//	responce = chatBotService.dbSearch(question);
			System.out.println(responce);
			return responce;
		}
	}

	public String dbSearch(String key) {
		// we are getting only one question
		//Optional<ChatMessage> responce = chatDb.findById(key);
		
		chatDb.findById(key);
		
		//return responce.toString();
		System.out.println(chatDb.findById(key).toString());
		return chatDb.findById(key).toString();
	}

}
