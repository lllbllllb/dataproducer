package com.test4javadev.pashkouski.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;

@WebService
public interface DateWebService {

    @WebMethod
    public LocalDateTime getDate();

    @WebMethod
    public String getStringDate();
}
