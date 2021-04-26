package httpjar.mapper;

import java.util.List;

import httpjar.model.dto.StudentDTO;

/*
 * 	httpjar.mapper包 已配置自动扫描Mapper注册进入IOC容器，无需额外配置
 */
public interface StudentMapper {
	List<StudentDTO> selectAll();
}
