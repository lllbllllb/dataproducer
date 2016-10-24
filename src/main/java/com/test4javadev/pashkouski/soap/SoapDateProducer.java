package com.test4javadev.pashkouski.soap;

import javax.jws.WebService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebService(endpointInterface = "com.test4javadev.pashkouski.soap.DateWebService", serviceName = "SoapDateProducer")
public class SoapDateProducer implements DateWebService {
    @Override
    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }

    @Override
    public String getStringDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.now();

        return localDateTime.format(formatter);
    }
}
