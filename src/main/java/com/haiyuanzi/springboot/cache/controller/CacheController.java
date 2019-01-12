package com.haiyuanzi.springboot.cache.controller;

import com.haiyuanzi.springboot.cache.bean.Employee;
import com.haiyuanzi.springboot.cache.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-07 14:09
 * @desc 缓存控制层
 **/
@RestController
@RequestMapping(value = "/cache",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class CacheController {

	@Autowired
	CacheService cacheService;

	@GetMapping(value = "/emp/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id){

		return cacheService.getEmp (id);
	}

	@GetMapping(value = "emp")
	public Employee updateEmployee(Employee employee){
		Employee emp = cacheService.update (employee);
		return emp;
	}

	@DeleteMapping(value = "emp/{id}")
	public String delEmployee(@PathVariable("id") Integer id){
		cacheService.deleteEmp (id);
		return "success";
	}

	@GetMapping(value = "/lastname")
	public Employee getEmpByName(String lastName){

		return cacheService.getEmpByName (lastName);
	}

}
