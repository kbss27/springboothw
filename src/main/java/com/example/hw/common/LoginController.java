package com.example.hw.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hyunwoo on 2017-08-25.
 */
@Controller
public class LoginController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showRoot() {
        return "index";
    }

}
