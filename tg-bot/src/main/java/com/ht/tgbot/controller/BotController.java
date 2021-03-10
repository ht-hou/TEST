package com.ht.tgbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.updates.GetUpdates;
import org.telegram.telegrambots.meta.generics.TelegramBot;


import javax.annotation.Resource;

@RestController
public class BotController {

    @Resource
    private TelegramBot bot;

    public void poll(){
        GetUpdates getUpdates = new GetUpdates();
        
    }



}
