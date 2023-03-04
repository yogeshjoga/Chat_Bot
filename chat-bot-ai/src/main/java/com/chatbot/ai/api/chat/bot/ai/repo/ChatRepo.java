package com.chatbot.ai.api.chat.bot.ai.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatbot.ai.api.chat.bot.ai.model.ChatModel;

public interface ChatRepo extends MongoRepository<ChatModel, String> {

}
