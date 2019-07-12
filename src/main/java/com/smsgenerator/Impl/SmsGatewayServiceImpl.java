package com.smsgenerator.Impl;

import com.smsgenerator.domen.Quote;
import com.smsgenerator.service.SmsGatewayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SmsGatewayServiceImpl implements SmsGatewayService {

    @Override
    public String getMessege(String port, List<String> phone, String message) {
        final String sim = "1";
        StringBuilder requestAddress = new StringBuilder("http://87.244.1.90:/default/en_US/send.html?u=admin&p=sms_93_ZAK_322ZAK933&l=&n=&m=");
        requestAddress.insert(83, message);
        requestAddress.insert(80, phone.get(0));
        requestAddress.insert(77, sim);
        requestAddress.insert(19, port);
        RestTemplate restTemplate = new RestTemplate();
       // System.out.println();("http://87.244.1.90:{}/default/en_US/send.html?u=admin&p=sms_93_ZAK_322ZAK933&l={}&n={PHONE_89001234567}&m={MESSAGE}", port, sim , phone, message);
       // return restTemplate.getForObject(requestAddress.toString(), String.class);
        return "GOOD";
    }
}
