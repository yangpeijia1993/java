package com.perlina.java.foundational.oop.enums;

import com.perlina.java.foundational.oop.interfaces.server.UserService;
import com.perlina.java.foundational.oop.interfaces.server.impl.AndriodUserServiceImpl;
import com.perlina.java.foundational.oop.interfaces.server.impl.IOSUserServiceImpl;
import com.perlina.java.foundational.oop.interfaces.server.impl.PCUserServiceImpl;

/**
 * 根据不同注册来源注册
 *
 * @author: Perlina
 * @version:2021/8/263:20 下午
 */
public class RegisterSourcesComponent {
    private UserService userService;
    public void handRegisterSource(RegisterSources registerSources){
        switch (registerSources){
            case PC:
                userService = new PCUserServiceImpl();
                break;
            case IOS_APP:
                userService = new IOSUserServiceImpl();
                break;
            case ANDROID_APP:
                userService = new AndriodUserServiceImpl();
                break;
            case UNKWON:
                System.out.println("未知来源不做处理");
                break;
        }
        userService.register();
    }
}
