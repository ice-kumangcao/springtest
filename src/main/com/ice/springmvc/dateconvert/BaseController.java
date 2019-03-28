package ice.springmvc.dateconvert;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ice
 * @date 18-12-14 上午11:30
 */
@Controller
@RequestMapping("/baseController")
public class BaseController {

    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class,
//                new CustomDateEditor(dateFormat, true, 19));
//    }

    @ResponseBody
    @RequestMapping("/date")
    public Object formatDate(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") Date date) {
        System.out.println(date);
        return date;
    }

    @ResponseBody
    @RequestMapping("demo")
    public Object setDemoEntity(DemoEntity demoEntity) {
        System.out.println(demoEntity);
        return demoEntity;
    }
}
