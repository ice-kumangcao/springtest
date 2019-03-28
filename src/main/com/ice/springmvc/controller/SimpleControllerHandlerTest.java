package ice.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ice
 * @date 18-12-3 下午4:11
 */
public class SimpleControllerHandlerTest implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(this.getClass() + " run");
        return null;
    }
}
