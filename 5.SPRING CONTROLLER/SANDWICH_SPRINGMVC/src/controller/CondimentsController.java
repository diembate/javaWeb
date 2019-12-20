package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CondimentsController {
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@RequestParam(name = "condiments", required = false) String[] condiments, Model model) {

        if (condiments != null) {
            model.addAttribute("condiments", condiments);
        } else {
            model.addAttribute("condiments", "not found");
        }
        return "show";
    }


    @GetMapping("/home")
    public String home() {

        return "home";
    }

}
