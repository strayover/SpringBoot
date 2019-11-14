package com.example.demo.demo.controller;

import com.example.demo.demo.dto.DemoDto;
import com.example.demo.demo.pojo.JSONResult;
import com.example.demo.demo.service.IDemoService;
import org.apache.commons.lang.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("demo")
public class demoController {
    private IDemoService demoService;

    @PostMapping("/list")
    public JSONResult list(){
        List list = demoService.getList();
        return JSONResult.ok(list);
    }

    @PostMapping("/idList")
    public JSONResult idList(@RequestBody @Valid DemoDto demoDto){
//        if(StringUtils.isEmpty(demoDto.getName())){
//            return JSONResult.errorMsg("id为空");
//        }
        List list = demoService.getIdList(demoDto.getId());
        return JSONResult.ok(list);
    }

    @PostMapping("/addList")
    public JSONResult addList(@RequestBody @Valid DemoDto demoDto){
        if(StringUtils.isEmpty(demoDto.getName())){
            return JSONResult.errorMsg("姓名为空");
        }
        if(StringUtils.isEmpty(demoDto.getAge())){
            return JSONResult.errorMsg("年龄为空");
        }
        if(StringUtils.isEmpty(demoDto.getLike())){
            return JSONResult.errorMsg("爱好为空");
        }
        try{
            demoService.addList(demoDto.getName(),demoDto.getAge(),demoDto.getLike());
            return JSONResult.ok("添加成功");
        }catch (Exception e){
            return JSONResult.errorException(e.getMessage());
        }
    }

    @PostMapping("/updateList")
    public JSONResult updateList(@RequestBody @Valid DemoDto demoDto){
        if(StringUtils.isEmpty(demoDto.getName())){
            return JSONResult.errorMsg("姓名为空");
        }
        if(StringUtils.isEmpty(demoDto.getAge())){
            return JSONResult.errorMsg("年龄为空");
        }
        if(StringUtils.isEmpty(demoDto.getLike())){
            return JSONResult.errorMsg("爱好为空");
        }
        try{
            demoService.updateList(demoDto.getId(),demoDto.getName(),demoDto.getAge(),demoDto.getLike());
            return JSONResult.ok("修改成功");
        }catch (Exception e){
            return JSONResult.errorException(e.getMessage());
        }
    }

    @PostMapping("/deleteList")
    public JSONResult deleteList(@RequestBody @Valid DemoDto demoDto){
        try{
            demoService.deleteList(demoDto.getId());
            return JSONResult.ok("删除成功");
        }catch (Exception e){
            return JSONResult.errorException(e.getMessage());
        }
    }

}
