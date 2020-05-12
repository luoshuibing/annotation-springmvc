package free.man.springmvc.annotationanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 上午11:06
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    /**
     * 显示首页
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value="/home")
    public String home() {
        System.out.println("=======");
        return "index";
    }

}
