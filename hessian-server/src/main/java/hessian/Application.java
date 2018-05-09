package hessian;


import hessian.server.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * Create by zl on  2018/5/9 11:15
 *
 * @description:
 * @author:zhaoliang
 */
@SpringBootApplication
public class Application {

    @Autowired
    private HelloWorldService helloWorldService;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    //发布服务
    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(helloWorldService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }

}
