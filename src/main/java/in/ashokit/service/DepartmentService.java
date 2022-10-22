package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Department;
import in.ashokit.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired 
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
        log.info( "Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
        log.info( "Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
