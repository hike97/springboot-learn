package com.haiyuanzi.springboot.cache.controller;

import com.haiyuanzi.springboot.cache.bean.Department;
import com.haiyuanzi.springboot.cache.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-13 12:58
 * @desc
 **/
@RestController
@RequestMapping (value = "/cache",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class CacheDepController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("dept/{id}")
	public Department  getEmployee(@PathVariable ("id") Integer id){

		return departmentService.getEmp (id);
	}
}
