package hessian.server.service.impl;

import hessian.server.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * Create by zl on  2018/5/9 11:18
 *
 * @description:
 * @author:zhaoliang
 */
@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello World! " + name;
    }

    @Override
    public Integer sayValue(Integer a) {
        return 8888 + a;
    }
}
