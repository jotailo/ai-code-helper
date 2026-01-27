package com.liuxuanhui.aicodehelper.ai;

import dev.langchain4j.service.SystemMessage;

import java.util.List;

public interface AICodeHelperService {

//    直接写在注解里面@SystemMessage("你好，我是编程领域的编程小助手，有什么问题我可以为你解答吗？^-^")
    @SystemMessage(fromResource = "system-prompt.txt") //指定配置文件
    String chat(String userMessage);

    @SystemMessage(fromResource = "system-prompt.txt")
    Report chatforReport(String userMessage);

    record Report(String name, List<String> suggestion){};
}
