package com.chatbot.whats.app.chat.bot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatbot.whats.app.chat.bot.model.WhatsAppModel;

public interface WhatsAppRepo extends MongoRepository<WhatsAppModel, String>{

}
