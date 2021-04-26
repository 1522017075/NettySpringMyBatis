package httpjar.util;

import org.springframework.context.ApplicationContext;

public class ServiceUtil {
	
	private volatile static ServiceUtil serviceUtil;
	
	private ServiceUtil() {}
	
	private static ServiceUtil getServiceUtil() {
		if(serviceUtil == null) {
			synchronized (ServiceUtil.class) {
				if(serviceUtil == null) {
					serviceUtil = new ServiceUtil();
				}
			}
		}
		return serviceUtil;
	}
	/*
	 * 用于手动获取@Service注册的service组件，通过驼峰命名获得
	 */
	
	public static Object getService(String serviceName) {
		serviceName += "Impl";
		ApplicationContext context = ContextUtil.getContextUtil();
		return context.getBean(serviceName);
	}
}
