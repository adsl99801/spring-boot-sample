package funs.puppys.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import funs.puppys.web.model.Account;

@Mapper
public interface AccountMapper {
    /**
     * @param id
     * @return
     */
    @Select("SELECT * FROM Account WHERE id = #{id}")
    Account find( Long id);
}
