package httpjar.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import httpjar.mapper.StudentMapper;
import httpjar.model.dto.StudentDTO;
import httpjar.service.StudentService;

/*
 * 	切记Service实现类需要去ApplicationContext.xml注册bean
 *  <bean id = "studentServiceImpl" class="httpjar.service.Impl.StudentServiceImpl"></bean>
 */

public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentMapper studentMapper;
	
	@Override
	public List<StudentDTO> selectAll() {
		return studentMapper.selectAll();
	}

}
