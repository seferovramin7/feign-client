package com.example.demo.client;

import com.example.demo.dto.TelegramDto;
import com.example.demo.dto.TelegramSendMessageDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "telegramClient", url = "https://api.telegram.org/bot7191060473:AAH1C926hw8dcxfCmPuITMCFr1dJg7TziBo")
public interface TelegramClient {


    @GetMapping("getUpdates")
    TelegramDto getUpdates();


    @PostMapping("sendMessage")
    void sendMessage(@RequestBody TelegramSendMessageDto dto);
}
