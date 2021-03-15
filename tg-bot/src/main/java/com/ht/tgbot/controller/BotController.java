package com.ht.tgbot.controller;

import com.ht.tgbot.bot.Rookie10086Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.updates.GetUpdates;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;


import javax.annotation.Resource;

@RestController
public class BotController {

    @Resource
    private TelegramBot bot;

    public void poll() {

        try {
            Rookie10086Bot rookie10086Bot = new Rookie10086Bot();

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}
