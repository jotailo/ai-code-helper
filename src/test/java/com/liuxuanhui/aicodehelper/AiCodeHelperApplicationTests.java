package com.liuxuanhui.aicodehelper;

import com.liuxuanhui.aicodehelper.ai.AICodeHelper;
import dev.langchain4j.model.chat.ChatModel;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperApplicationTests {

	@Resource
	private AICodeHelper aiCodeHelper;


	@Test
	void chat() {
		aiCodeHelper.chat("你好 我是开发者！");
	}
}
