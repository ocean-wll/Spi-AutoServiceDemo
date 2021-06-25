package pres.ocean.case1;

import pers.ocean.HelloService;

/**
 * @author ocean_wll
 * @date 2021/6/25
 */
public class OceanHelloService implements HelloService {

    @Override
    public String sayHi() {
        return "hello ocean!";
    }
}
