package com.mychatbot.pugChatBot.repo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="mychat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
	@Id
	private String question;
	private String answer;

}
