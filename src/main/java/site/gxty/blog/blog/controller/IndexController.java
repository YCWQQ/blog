package site.gxty.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue="World1234") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
