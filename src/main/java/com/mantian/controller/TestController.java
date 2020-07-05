package com.mantian.controller;

import com.mantian.bean.TestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:TestController
 * @Description:
 * @Date:2020/7/5 22:40
 * @currentVersion:1.0
 * @Modify:TestController
 * @UpdateDate: 22:40
 */
@Controller
public class TestController {
    @RequestMapping("stringTest")
    @ResponseBody
    public String returnStr() {
        return "hello,即使是中文也可以";
    }

    @RequestMapping("entityTest")
    @ResponseBody
    public TestBean returnEntify() {
        TestBean testBean = new TestBean();
        testBean.setTestStr("测试实体");
        testBean.setTestInt(12);
        return testBean;
    }


}
