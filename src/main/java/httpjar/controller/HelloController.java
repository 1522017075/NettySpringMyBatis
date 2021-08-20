package httpjar.controller;

import httpjar.service.TestService;
import httpjar.util.WebUtil;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;

@Path
public class HelloController {

	/*
	 * https://www.baeldung.com/blade
	 * We can using this frame to run a http without tomcat in Bank
	 * 因为此框架在使用时，由于controller类的对象 是blade框架new出来的(Spring容器要求所有对象由Spring来创建)
	 * 所以无法使用@Autowired注解获取Service实现类（不影响Service层中使用@Autowired去获取Mapper对象）
	 * 需手动通过context对象获取对应Service进行（已封装好context类）  该bug耗时一天查出
	 */
	
	@GetRoute("/list")
	public void list(){

		TestService bean = WebUtil.getBean(TestService.class);
		bean.test();
        
	}
}
