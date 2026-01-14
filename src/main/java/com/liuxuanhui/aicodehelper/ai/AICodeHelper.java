package com.liuxuanhui.aicodehelper.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author:Liu Xuanhui
 * @Description:
 * @DateTime: 2026/1/13 17:39
 * @Component:
 */

@Service
@Slf4j
public class AICodeHelper {

    @Resource
    private ChatModel qwenChatModel;

    // 实现和大模型对话，只限文本内容
    public String chat(String message){
        UserMessage userMessage = UserMessage.from(message);
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI 输出：" + aiMessage.toString());
        return aiMessage.text();
    }

    // 实现多模态大模型对话，包括识别图片等内容
    public String chatWithOtherType(UserMessage userMessage){
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        log.info("AI 输出：" + aiMessage.toString());
        return aiMessage.text();
    }
}
