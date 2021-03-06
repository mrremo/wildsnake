package pl.jwest.wildsnake.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by remix on 12.10.2015.
 */
@Controller
public class HomeController {
    @Value("${mainpage.message}")
    private String pageMessage;
    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("pageMessage", pageMessage);
        return "index";}
}
