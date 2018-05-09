package hessian;

import hessian.client.service.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Create by zl on  2018/5/9 11:25
 *
 * @description:
 * @author:zhaoliang
 */
@SpringBootApplication
public class Application {

    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8090/HelloWorldService");
        factory.setServiceInterface(HelloWorldService.class);
        return factory;
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
