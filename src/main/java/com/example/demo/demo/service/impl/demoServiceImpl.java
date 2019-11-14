package com.example.demo.demo.service.impl;

import com.example.demo.demo.mapper.DemoMapper;
import com.example.demo.demo.service.IDemoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class demoServiceImpl implements IDemoService {
    DemoMapper mapper;

    @Override
    public List getList(){
        return mapper.getListData();
    }

    @Override
    public List getIdList(Integer id){
        return mapper.getIdListData(id);
    }

    @Override
    public void addList(String name,String age,String like){
        mapper.addListData(name,age,like);
    }

    @Override
    public void updateList(Integer id,String name,String age,String like){
        mapper.updateListData(id,name,age,like);
    }

    @Override
    public void deleteList(Integer id){
        mapper.deleteListData(id);
    }
}
