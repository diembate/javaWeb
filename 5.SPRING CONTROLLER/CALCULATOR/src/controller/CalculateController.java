package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public String calculate(@RequestParam float FirstOperand,
                            @RequestParam String Operator,
                            @RequestParam float SecondOperand, Model model) {
        model.addAttribute("FirstOperand", FirstOperand);
        model.addAttribute("SecondOperand", SecondOperand);
        model.addAttribute("Operator", Operator);
        float result = 0;
        switch (Operator) {
            case "Addition":
                result = FirstOperand + SecondOperand;
                break;
            case "Subtraction":
                result = FirstOperand - SecondOperand;
                break;
            case "Multiplication":
                result = FirstOperand * SecondOperand;
                break;
            case "Division":
                result = FirstOperand / SecondOperand;
                break;
        }
        model.addAttribute("result", result);
        return "home";
    }
}

