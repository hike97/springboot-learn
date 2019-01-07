package com.haiyuanzi.springboot.cache.controller;

import com.haiyuanzi.springboot.cache.bean.Employee;
import com.haiyuanzi.springboot.cache.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

	@GetMapping(value = "emp/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id){

		return cacheService.getEmp (id);
	}
}
