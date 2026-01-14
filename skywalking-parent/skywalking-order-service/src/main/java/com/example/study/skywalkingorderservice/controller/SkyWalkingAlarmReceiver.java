package com.example.study.skywalkingorderservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/skywalking/alarm")
public class SkyWalkingAlarmReceiver {

    private final static ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger logger = LoggerFactory.getLogger(SkyWalkingAlarmReceiver.class);

    // 接收 SkyWalking 告警推送
    @PostMapping("/receive")
    public String receiveAlarm(@RequestBody List<Map<String, Object>> alarmList) throws JsonProcessingException {
        // 打印告警信息（后续可扩展：推送钉钉、企业微信等）
        logger.info("收到 SkyWalking 告警，共 {} 条，详情：{}", alarmList.size(), (objectMapper.writeValueAsString(alarmList)));
        
        // 对接企业微信/钉钉：调用对应机器人接口，推送告警信息
        // sendDingTalkAlarm(alarmList);
        
        return "success";
    }
}