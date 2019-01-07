package com.haiyuanzi.springboot.cache.mapper;

import com.haiyuanzi.springboot.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author hike97
 * @create 2019-01-07 11:03
 * @desc
 **/
@Mapper
public interface EmployeeMapper {

	@Select ("select * from employee where id = #{id}")
	public Employee getEmpById(Integer id);

	@Update ("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id = #{id}")
	public void updateEmp(Employee employee);

	@Delete ("delete from employee where id=#{id}")
	public void deleteEmpById(Integer id);

	@Insert ("insert into employee(lastName,email,gender,d_id})values(#{lastName},#{email},#{gender},#{dId})")
	public void inserEmployee(Employee employee);
}
