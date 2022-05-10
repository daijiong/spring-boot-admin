package com.renjia.sba.service.msgcenter;

import org.djflying.SbaApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SbaApplication.class)
class MsgCenterDingRobotServiceImplTest {

    @Autowired
    private MsgCenterDingRobotService msgCenterDingRobotService;

    @Test
    void sendMsgToDingRobot() {
        StringBuilder alarmContent = new StringBuilder();
        alarmContent.append("test ");

        System.out.println(alarmContent.toString());

        msgCenterDingRobotService.sendMsgToDingRobot(alarmContent.toString());
    }
}