package linkogbilledtest.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class ThomasController {

    Logger log = Logger.getLogger(ThomasController.class.getName());

    private String INDEX = "index";
    private String YES = "yes";
    private String NO = "no";

    @GetMapping("")
    public String index(){

        log.info("index called");

        return INDEX;
    }

    @GetMapping("/no")
    public String no(){

        log.info("no called");

        return NO;
    }

    @GetMapping("/yes")
    public String yes(){

        log.info("yes called");

        return YES;
    }


}
