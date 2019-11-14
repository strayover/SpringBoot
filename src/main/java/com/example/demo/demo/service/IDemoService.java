package com.example.demo.demo.service;

import java.util.List;

public interface IDemoService {
    List getList();
    List getIdList(Integer id);
    void addList(String name,String age,String like);
    void updateList(Integer id,String name,String age,String like);
    void deleteList(Integer id);
}
