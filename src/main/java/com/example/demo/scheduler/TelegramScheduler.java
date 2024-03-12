package com.example.demo.scheduler;

import com.example.demo.client.TelegramClient;
import com.example.demo.dto.Result;
import com.example.demo.dto.TelegramSendMessageDto;
import java.util.ArrayList;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TelegramScheduler {

    private final TelegramClient telegramClient;

    public TelegramScheduler(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @Scheduled(fixedRate = 10000)
    public void readMessages() {
        ArrayList<Result> results = telegramClient.getUpdates().getResult();
        Long id = (long) results.get(results.size() - 1).message.chat.id;
        String text = results.get(0).message.text;

        TelegramSendMessageDto dto = new TelegramSendMessageDto();

        dto.setChatId(id);
        dto.setText(text + " mesajiniz qebul olundu !!");

        telegramClient.sendMessage(dto);
    }

}
