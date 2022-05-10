//package org.djflying.notifier;
//
//import java.util.Map;
//
//import com.renjia.sba.service.msgcenter.MsgCenterDingRobotService;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.util.StringUtils;
//
//import de.codecentric.boot.admin.server.domain.entities.Instance;
//import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
//import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
//import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
//import lombok.extern.slf4j.Slf4j;
//import reactor.core.publisher.Mono;
//
///**
// * 消息中心通知者
// *
// * @author daijiong
// * @version : MessageCenterNotifier.java, v 0.1 2021/6/22 10:56 daijiong Exp $$
// */
//@Slf4j
//public class MessageCenterNotifier extends AbstractStatusChangeNotifier {
//
//    private final MsgCenterDingRobotService msgCenterDingRobotService;
//    /** 当前运行环境 */
//    @Value("${spring.profiles.active}")
//    private String env;
//    /** 需要报警的环境 */
//    @Value("${sba.alarm.env:prod}")
//    private String alarmEnv;
//
//    public MessageCenterNotifier(InstanceRepository repository,
//                                 MsgCenterDingRobotService msgCenterDingRobotService) {
//        super(repository);
//        this.msgCenterDingRobotService = msgCenterDingRobotService;
//    }
//
//    @Override
//    protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
//        String serviceName = instance.getRegistration().getName();
//        String serviceUrl = instance.getRegistration().getServiceUrl();
//        String status = instance.getStatusInfo().getStatus();
//        Map<String, Object> details = instance.getStatusInfo().getDetails();
//        StringBuilder alarmContext = new StringBuilder();
//        alarmContext.append("服务监控报警").append("：").append(serviceName).append("服务状态：").append(status).append("，详情：").append(details.toString());
//        log.info(alarmContext.toString());
//        if (alarmEnv.contains(env)) {
//            return Mono.fromRunnable(() -> {
//                //调用消息中心发送报警，报警信息为alarmContext
//                msgCenterDingRobotService.sendMsgToDingRobot(alarmContext.toString());
//                log.info("调用消息中心发送报警");
//            });
//        } else {
//            return Mono.empty();
//        }
//    }
//}
