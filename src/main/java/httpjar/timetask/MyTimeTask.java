package httpjar.timetask;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import httpjar.model.dto.StudentDTO;
import httpjar.service.StudentService;
import httpjar.util.ServiceUtil;

public class MyTimeTask {
	
	private static final Logger log = LoggerFactory.getLogger(MyTimeTask.class);
	private volatile static boolean flag = true;
    private static int count;

    private MyTimeTask () {}
    
    public static void cron() {
    	// 由于定时任务的bean可能会被多个spring上下文线程调用启动，故单例使其只可拥有一个线程进行工作
    	if(flag) {
    		synchronized(MyTimeTask.class) {
    			if(flag) {
    				new ClassPathXmlApplicationContext("timeTaskConfig.xml");
    				flag = false;
    			}
    		}
    	}
        log.info("每五秒执行一次定时任务 {}", count++);
		StudentService studentService = (StudentService)ServiceUtil.getService("studentService");
				
		List<StudentDTO> list = studentService.selectAll();
	    for(StudentDTO stu:list){
		    System.out.println(stu.toString());
	    }
    }

}
