package cn.hourinn.demo.optional;

import org.junit.Test;

public class TestOptional {

	@Test
	public  void testOfAndGet() {
		// 如果此时get()的包装对象为null，则会报NoSuchElemmentException异常
		IMessage message = MessageUtil.getMessageNotNull().get();
		message.print();
	}
	
	@Test
	public  void testofNullableAndorElse() {
		//orElse 如果此时的optional包装的对象为null，可以通过orElse重新设置一个对象
		IMessage message = MessageUtil.getMessageAcceptNull().orElse(new MessageImpl());
		message.print();
	}
}
