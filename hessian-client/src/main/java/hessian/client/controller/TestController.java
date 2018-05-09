package hessian.client.controller;


import hessian.client.controller.vo.TestVo;
import hessian.client.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by zl on  2018/5/9 11:27
 *
 * @description:
 * @author:zhaoliang
 */
@RestController
public class TestController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test")
    public TestVo test() {
        TestVo testVo = new TestVo();
        String one =  helloWorldService.sayHello("Spring boot with Hessian.");
        int a = helloWorldService.sayValue(100);
        testVo.setA(one);
        testVo.setB(a);
        return testVo;
    }

}
