package org.web.controller;

import org.dao.mapper.DeptMapper;
import org.dao.model.Dept;
import org.service.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SongX on 2017/9/12.
 */
@RestController
public class WxController {

    @Autowired
    private DeptMapper deptMapper;


    @Autowired
    WxService wxService;

    @RequestMapping("wx")
    public String cc(){
        wxService.cc();
        List<Dept> deptList =  deptMapper.selectDept();
        for(Dept dept : deptList){
            System.out.println(dept.getDeptNo() + " " + dept.getdName() + " " + dept.getLoc());
        }
        return "ccc";
    }


}
