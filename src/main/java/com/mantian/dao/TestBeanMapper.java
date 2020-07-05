package com.mantian.dao;

import com.mantian.bean.TestBean;
import com.mantian.bean.TestBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestBeanMapper {
    long countByExample(TestBeanExample example);

    int deleteByExample(TestBeanExample example);

    int deleteByPrimaryKey(Integer testint);

    int insert(TestBean record);

    int insertSelective(TestBean record);

    List<TestBean> selectByExample(TestBeanExample example);

    TestBean selectByPrimaryKey(Integer testint);

    int updateByExampleSelective(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    int updateByExample(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    int updateByPrimaryKeySelective(TestBean record);

    int updateByPrimaryKey(TestBean record);
}