package httpjar.controller;

import java.util.List;

import httpjar.service.TestService;
import httpjar.util.WebUtil;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.MultipartParam;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.multipart.FileItem;

import httpjar.model.dto.StudentDTO;
import httpjar.service.FileService;
import httpjar.service.StudentService;

@Path
public class HelloController {

	/*
	 * https://www.baeldung.com/blade
	 * We can using this frame to run a http without tomcat in Bank
	 * 因为此框架在使用时，由于controller类的对象 是blade框架new出来的(Spring容器要求所有对象由Spring来创建)
	 * 所以无法使用@Autowired注解获取Service实现类（不影响Service层中使用@Autowired去获取Mapper对象）
	 * 需手动通过context对象获取对应Service进行（已封装好context类）  该bug耗时一天查出
	 */
	
	@GetRoute("/home")
	public void formParam(){
		StudentService studentService = WebUtil.getBean(StudentService.class);
		
		List<StudentDTO> list = studentService.selectAll();
        for(StudentDTO stu:list){
    	    System.out.println(stu.toString());
        }
        
	}
	
	@PostRoute("/upload")
	public void fileParam(@MultipartParam FileItem fileItem){
		FileService fileService = WebUtil.getBean(FileService.class);

		
		if(fileService.saveFile(fileItem)) {
			System.out.println("success save file!");
		} else {
			System.out.println("failed save file!");
		}
	    
	}
	
	@GetRoute("/list")
	public void list(){

		TestService bean = WebUtil.getBean(TestService.class);
		bean.test();

//		ApplicationContext context = ContextUtil.getContextUtil();
//		String[] list = context.getBeanDefinitionNames();
//		for(String item:list) {
//			System.out.println(item);
//		}
        
	}
}
