package com.youssef.cxf.cxftest4;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

