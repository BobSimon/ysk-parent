package com.ysk.component;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ysk.App;

/**
 * @author Bob Simon
 * @desc rabbitmq 消费者
 */
@Component
public class Receiver {
	
	private static Logger logger = Logger.getLogger(App.class);

	/**
	 * 订阅某个消息
	 * @param msg
	 * @return
	 */
	@RabbitListener(queues = "hello.queue1")
	public String processMessage1(String msg) {
		logger.info(Thread.currentThread().getName() + " 接收到来自hello.queue1队列的消息：" + msg);
		return msg.toUpperCase();
	}

	/**
	 * 订阅某个消息
	 * @param msg
	 */
	@RabbitListener(queues = "hello.queue2")
	public void processMessage2(String msg) {
		logger.info(Thread.currentThread().getName() + " 接收到来自hello.queue2队列的消息：" + msg);
	}


}