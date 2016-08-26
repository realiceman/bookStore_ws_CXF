
package com.youssef.cxf.cxftest4;

import javax.jws.WebService;

@WebService(endpointInterface = "com.youssef.cxf.cxftest4.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

