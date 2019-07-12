package com.smsgenerator.controller;

import com.smsgenerator.domen.ManualDevice;
import com.smsgenerator.service.SmsGatewayService;
import com.smsgenerator.service.UpdateDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.smsgenerator.domen.SmsGeneratorConstants.*;

@RestController("Generate requests")
@RequestMapping("/generate")
@RequiredArgsConstructor
public class RequestGeneratorController {

    @Autowired
    private SmsGatewayService smsGatewayService;
    @Autowired
    private UpdateDBService updateDBService;

    @GetMapping()
    public String generateRequest(@RequestParam(name = PORT, required = false) String port,
                                  @RequestParam(name = PHONE, required = false) List<String> numbers,
                                  @RequestParam(name = MESSAGE, required = false, defaultValue = "") String message,
                                  @RequestParam(value = UPDATE_MESSAGE, required = false) boolean updateMessage) {
        System.out.println(numbers);
        String quote = smsGatewayService.getMessege(port, numbers, message);
        return quote;
    }

    @GetMapping("/setting-device")
    public String settinDevice(
            @RequestBody ManualDevice data) {
        return updateDBService.updateDB(data);
    }
}
