package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DICTIONARY {
        @GetMapping("/translate")
        public String translate(@RequestParam String Search, Model model) {
            model.addAttribute("Search", Search);
            Map<String, String> newSearch = new HashMap<>();
            newSearch.put("hello", "Xin chào");
            newSearch.put("how", "Thế nào");
            newSearch.put("book", "Quyển vở");
            newSearch.put("computer", "Máy tính");
            String result = newSearch.get(Search);
            if (result != null ) {
                model.addAttribute("result", result);}
            else { model.addAttribute("result", "not found");
        }
            return "Search";}
        @GetMapping("/home")
        public String home() {

            return "index";
        }


}

