package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Qualifier("UserServiceImpl")
    @Autowired
    private UserService userService;

    @RequestMapping("/gologin")
    public String gologin() {

        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Model model,HttpSession session) {
        if (!userService.isUserExist(username)) {
            System.out.println("用户名不存在");
            model.addAttribute("msg", "用户名不存在");
            return "login";
        } else {
            if (password.equals(userService.getPasswordByUsername(username))) {
                System.out.println("登录成功");
                model.addAttribute("msg", "登陆成功");
                //把用户的信息存在session中
                session.setAttribute("userLoginInfo",username);
                return "redirect:/book/allBook";
            } else {
                System.out.println("密码错误");
                System.out.println("账号:"+username+"密码:"+password);
                model.addAttribute("msg", "密码错误！");
                return "login";
            }
        }
        //把用户的信息存在session中
        // session.setAttribute("user",model);
    }
}