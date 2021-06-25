package pers.ocean;

import java.util.ServiceLoader;

/**
 * @author ocean_wll
 * @date 2021/6/25
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<HelloService> serviceLoader = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : serviceLoader) {
            System.out.println(helloService.getClass().getName() + " say: " + helloService.sayHi());
        }
    }
}
