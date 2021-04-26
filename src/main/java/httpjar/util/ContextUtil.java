package httpjar.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
	private volatile static ApplicationContext contextUtil;
	
	private ContextUtil() {}
	
	public static ApplicationContext getContextUtil() {
		if(contextUtil == null) {
			synchronized (ContextUtil.class) {
				if(contextUtil == null) {
					contextUtil = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				}
			}
		}
		return contextUtil;
	}
}
