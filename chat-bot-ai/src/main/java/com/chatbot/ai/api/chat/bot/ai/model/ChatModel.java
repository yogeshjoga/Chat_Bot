package com.chatbot.ai.api.chat.bot.ai.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="chat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatModel {
	
	@Id
	private String question;
	private String answer;
}
