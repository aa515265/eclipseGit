package com.ssm.controller;


import com.ssm.entity.UserInfo;
import com.ssm.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gawen on 2018/1/22.
 */
@org.springframework.stereotype.Controller
public class UserInfoController {
    @Autowired
    private IUserInfoService service;


    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        String uname=request.getParameter("name");

        Integer uage=Integer.valueOf(request.getParameter("age"));
        System.out.print(2211);
        UserInfo info=new UserInfo();
        info.setAge(uage);
        info.setName(uname);

        service.add(info);
        return new ModelAndView("/welcome.jsp");
    }
    public IUserInfoService getService() {
        return service;
    }
    public void setService(IUserInfoService service) {
        this.service = service;
    }
}