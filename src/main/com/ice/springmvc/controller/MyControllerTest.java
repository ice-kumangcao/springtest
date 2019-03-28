package ice.springmvc.controller;

import ice.springmvc.common.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ice
 * @date 18-12-10 上午11:29
 */
public class MyControllerTest implements Controller {
    /**
     * 主函数
     *
     * @param httpRequest  request
     * @param httpResponse response
     * @return 处理后数据
     */
    @Override
    public ModelAndView run(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        System.out.println(this.getClass() + " run");
        return null;
    }
}
