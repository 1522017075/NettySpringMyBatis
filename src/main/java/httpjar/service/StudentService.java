package httpjar.service;

import java.util.List;

import httpjar.model.dto.StudentDTO;

public interface StudentService {

	List<StudentDTO> selectAll();
}
