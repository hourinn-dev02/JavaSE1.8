package cn.hourinn.demo.optional;

import java.util.Optional;
/*
 * optional类的最大作用，把null的验证交给了提供方，而不是接收方
 */
public class MessageUtil {
	
	/*
	 * of方法包装对象，保证调用处能取到不为null的对象,通过get()方法取得包装对象
	 */
	public static Optional<MessageImpl> getMessageNotNull() {
		return  Optional.of(null);       //此时会在此处抛NullPointerException
		//return  Optional.of(new MessageImpl());
	}
	
	/*
	 * 允许接收一个null对象
	 */
	public static Optional<MessageImpl> getMessageAcceptNull() {
		//return  Optional.ofNullable(new MessageImpl());
		return  Optional.ofNullable(null);
	}
	
}
