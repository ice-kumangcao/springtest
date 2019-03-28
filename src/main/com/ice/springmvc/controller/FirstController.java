package ice.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * a controller demo
 * @author ice
 * @date 18-12-3 下午3:21
 */
@Controller
@RequestMapping("/base")
public class FirstController {

    @RequestMapping("/3")
    @ResponseBody
    public Object first(HttpServletRequest request, String name) {
        System.out.println("/base/1");
        return "FirstController -> message";
    }

    @RequestMapping("/2")
    public ModelAndView modelAndView() {
        System.out.println(this.getClass() + " run modelAndView()");
        return new ModelAndView("/test");
    }
}
