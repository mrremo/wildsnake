package pl.jwest.wildsnake.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by remix on 12.10.2015.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String mainPage() { return "index";}
}
