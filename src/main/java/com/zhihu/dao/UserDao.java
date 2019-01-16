package com.zhihu.dao;

import com.zhihu.entity.UserEmployEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select business as employ,count from count_business_result where business !='unknown' order by count desc limit 0,10")
    List<UserEmployEntity> topTenEmploy();
}
