package ua.com.olh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by okten26 on 12/26/18.
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }


}
