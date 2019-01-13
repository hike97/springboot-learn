package com.haiyuanzi.springboot.cache.mapper;

import com.haiyuanzi.springboot.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-01-07 11:03
 * @desc
 **/
@Mapper
public interface DepartmentMapper {
	@Select ("select * from department where id = #{id}")
	Department getDeptById (Integer id);
}
