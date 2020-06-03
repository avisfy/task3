package task3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import task3.model.User;
import task3.services.UserService;

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
    public User genUser() {
        User u  = new User("uname", "usurname", "umail@mail.mm", "2000-02-02");
        u.setId(1);
        return u;
    }

    @RequestMapping(value = "/save_user", method = RequestMethod.POST)
    public ResponseEntity saveUser(@RequestBody User u) {
        userService.add(u);
        List<User> users = userService.allUsers();
        for(User user: users)  {
            System.out.println(user);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
