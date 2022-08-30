package org.djflying.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回调接口业务控制器
 *
 * @author daijiong
 * @version v1.0 2022/8/30 15:54
 */
@Slf4j
@RestController
@RequestMapping(value = "callBack")
public class CallBackController {

    @GetMapping(value = "/test")
    public void testCallBack(String request) {
        log.info("请求参数：" + request);
    }
}
