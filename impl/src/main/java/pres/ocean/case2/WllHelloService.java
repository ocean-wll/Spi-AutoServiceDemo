package pres.ocean.case2;

import com.google.auto.service.AutoService;
import pers.ocean.HelloService;

/**
 * @author ocean_wll
 * @date 2021/6/25
 */
@AutoService(HelloService.class)
public class WllHelloService implements HelloService {

    @Override
    public String sayHi() {
        return "hello wll!";
    }
}
