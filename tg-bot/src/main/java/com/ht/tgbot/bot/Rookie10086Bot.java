package com.ht.tgbot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Rookie10086Bot extends TelegramLongPollingBot {
    @Value("${telegramToken}")
    private String telegramToken;

    @Override
    public String getBotUsername() {
        return "rookie10086bot";
    }

    @Override
    public String getBotToken() {
        return telegramToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = SendMessage
                    .builder()
                    .chatId(Long.toString(update.getMessage().getChatId()))
                    .text(update.getMessage().getText())
                    .build();// Create a SendMessage object with mandatory fields
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
