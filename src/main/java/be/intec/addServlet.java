package be.intec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addServlet {

    @RequestMapping("/add")
    public String add() {
        return "display.jsp";
    }
}
