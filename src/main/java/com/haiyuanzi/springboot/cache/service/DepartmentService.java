package com.haiyuanzi.springboot.cache.service;

import com.haiyuanzi.springboot.cache.bean.Department;
import com.haiyuanzi.springboot.cache.mapper.DepartmentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-13 13:14
 * @desc
 **/
@Slf4j
@CacheConfig (cacheNames = "dept")
@Service
public class DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Cacheable
	public Department getEmp (Integer id) {
		log.info ("查询部门的id为:"+id);
		return departmentMapper.getDeptById(id);
	}
}
