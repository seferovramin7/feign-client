package com.example.demo.controller;

import com.example.demo.client.TelegramClient;
import com.example.demo.dto.TelegramDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelegramController {


    private final TelegramClient telegramClient;

    public TelegramController(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @GetMapping("my-bot")
    public int getUpdates() {
       return telegramClient.getUpdates().getResult().get(0).message.chat.id;
    }

}
