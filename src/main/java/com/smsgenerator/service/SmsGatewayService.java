package com.smsgenerator.service;

import com.smsgenerator.domen.Quote;

import java.util.List;

public interface SmsGatewayService {

    public String getMessege(String port, List<String> phone, String message);

}
