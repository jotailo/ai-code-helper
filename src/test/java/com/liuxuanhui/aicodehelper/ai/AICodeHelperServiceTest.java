package com.liuxuanhui.aicodehelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Priority;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AICodeHelperServiceTest {

    @Resource
    private AICodeHelperService aiCodeHelperService;

    @Test
    void chat() {
        String chat = aiCodeHelperService.chat("你好，我是god");
        System.out.println(chat);
    }

    @Test
    void chatWithMemory() {
        String chat = aiCodeHelperService.chat("你好，我是god");
        System.out.println(chat);
        chat = aiCodeHelperService.chat("你好，我是谁");
        System.out.println(chat);
    }
}