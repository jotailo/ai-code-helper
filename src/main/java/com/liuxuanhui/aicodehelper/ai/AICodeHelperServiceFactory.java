package com.liuxuanhui.aicodehelper.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Liu Xuanhui
 * @Description:
 * @DateTime: 2026/1/26 15:41
 * @Component:
 */

@Configuration
public class AICodeHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModel;

    @Bean
    public AICodeHelperService aiCodeHelperService() {
        return AiServices.create(AICodeHelperService.class, qwenChatModel);
    }
}
