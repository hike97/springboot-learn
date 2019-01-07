package com.haiyuanzi.springboot.cache.service;

import com.haiyuanzi.springboot.cache.bean.Employee;
import com.haiyuanzi.springboot.cache.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-07 14:10
 * @desc
 **/
@Service
@Slf4j
public class CacheService {

	@Autowired
	EmployeeMapper mapper;

	/**
	 * 将方法结果进行缓存，以后再要相同的数据，直接缓存中获取，不用调用方法；
	 * CacheManager管理多个Cache组件的，对缓存的真正CRUD操作在Cache组件中，
	 * 每一个缓存组件有自己唯一一个名字；
	 * 几个属性：
	 * 		cacheNames/value 指定缓存组件的名字;
	 * 		key:缓存数据使用的key;可以用它来指定。。默认是使用方法参数的值 1-方法返回值
	 * 		    编写spEL;#id 参数id的值 # a0
 * 		    keyGenerator:key的生成器；可以自己指定key的生成器的组件id
	 * 		    key/key generator 二选一
 *	        cacheManager:指定缓存管理器；或者cacheResolver指定缓存解析器
 *	        condition: 指定符合条件的情况
 *	        unless:当unless指定的条件为true,方法的返回值不会被缓存 可以获取到结果进行判断
 *	        sync:是否使用异步模式
	 * @param id
	 * @return
	 */
	@Cacheable(cacheNames = {"emp"})
	public Employee getEmp (Integer id) {
		log.info ("查询员工的id为:"+id);
		return mapper.getEmpById (id);
	}
}
