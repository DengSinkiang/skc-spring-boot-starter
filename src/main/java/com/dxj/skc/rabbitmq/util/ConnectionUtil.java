package com.dxj.skc.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Description:
 * @Author: Sinkiang
 * @Date: 2020/7/30 8:50
 * @CopyRight: 2020 sk-admin all rights reserved.
 */
public class ConnectionUtil {
    /**
     * 建立与RabbitMQ的连接
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("127.0.0.1");
        //端口
        factory.setPort(2181);
        //设置账号信息，用户名、密码
        factory.setUsername("guest");
        factory.setPassword("guest");
        // 通过工程获取连接
        return factory.newConnection();
    }
}
