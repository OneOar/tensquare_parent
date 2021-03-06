package com.tensquare.test;

import com.tensquare.rabbit.RabbitApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitApplication.class)
public class ProdTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void sendMsg1(){
        rabbitTemplate.convertAndSend("itcast","测试直接模式");
    }

    /**
     * 分裂模式
     */
    @Test
    public void sendMsg2(){
        rabbitTemplate.convertAndSend("chuanzhi","","分裂模式测试···");
    }

    /**
     * 主题模式
     */
    @Test
    public void sendMsg3(){
        rabbitTemplate.convertAndSend("topic84","good.abc.log","分裂模式测试···");
    }
}
