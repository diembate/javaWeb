package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Currency_converter {
    @GetMapping("/converter")
    public String CurrencyConverter(@RequestParam float usd,@RequestParam float rate, Model model) {
        float result = usd * rate;
        model.addAttribute("result", result);
        return "result";
    }
    @GetMapping("/home")
            public String home() {

        return "index";
    }
}
