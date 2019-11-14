package com.example.demo.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DemoMapper extends BaseMapper {
    List getListData();
    List getIdListData(@Param("id") Integer id);
    void addListData(@Param("name") String name,@Param("age") String age,@Param("like") String like);
    void updateListData(@Param("id") Integer id,@Param("name") String name,@Param("age") String age,@Param("like") String like);
    void deleteListData(@Param("id") Integer id);
}

