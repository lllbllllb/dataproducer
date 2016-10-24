package com.test4javadev.pashkouski.main;

import com.test4javadev.pashkouski.soap.DateWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WsTest {

    public static void main(String[] args) {
        soapTest();
    }
    private static void soapTest() {

        //http://localhost:8085/soap/DateWebService?wsdl
        String soapUrl = "http://localhost:8085/soap/DateWebService?wsdl";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(DateWebService.class);
        factoryBean.setAddress(soapUrl);

        DateWebService webService = (DateWebService) factoryBean.create();

        String dateTime = webService.getStringDate();

        System.out.println(dateTime);
    }
}
