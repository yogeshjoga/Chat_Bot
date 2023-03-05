package com.mychatbot.pugChatBot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatDb extends MongoRepository<ChatMessage, String>{

}
