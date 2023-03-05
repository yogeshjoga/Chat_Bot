package com.mychatbot.pugChatBot.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
@EnableReactiveMongoRepositories
public interface ChatDb extends MongoRepository<ChatMessage, String>{
	 public ChatMessage findBykey(String question);
	  public List<ChatMessage> findByValue(String answer);
}
