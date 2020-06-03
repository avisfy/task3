package task3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import task3.model.User;
import task3.services.UserService;
import task3.services.UserServiceImpl;

import java.util.List;

@Controller
public class TaskController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allUsers() {
        List<User> users = userService.allUsers();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("users");
        mv.addObject("users", users);
        return mv;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("edit");
        return mv;
    }

    @RequestMapping(value = "/gen_user", method = RequestMethod.GET)
    @ResponseBody
    public String genUser() {
        return "test";
        //return new User("name", "surname", "mail@mail.mm", "2000-02-02");
    }
}
