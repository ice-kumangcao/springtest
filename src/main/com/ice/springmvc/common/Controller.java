package ice.springmvc.common;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义base controller类
 * @author ice
 * @date 18-12-10 上午11:23
 */
public interface Controller {
    /**
     * 主函数
     * @param httpRequest request
     * @param httpResponse response
     * @return 处理后数据
     */
    ModelAndView run(HttpServletRequest httpRequest, HttpServletResponse httpResponse);
}
