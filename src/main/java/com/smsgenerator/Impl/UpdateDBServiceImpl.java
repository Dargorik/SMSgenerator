package com.smsgenerator.Impl;

import com.smsgenerator.domen.Device;
import com.smsgenerator.domen.ManualDevice;
import com.smsgenerator.repos.CityRepos;
import com.smsgenerator.repos.DeviceRepositoriy;
import com.smsgenerator.service.UpdateDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDBServiceImpl implements UpdateDBService {

    @Autowired
//    private DeviceRepositoriy deviceRepos;
    private CityRepos cityReposж;

    private static final String ACTION_ADD = "add";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_MODIFY = "modify";


    @Override
    public String updateDB(ManualDevice manualDevice) {
        switch (manualDevice.getAction()) {
            case ACTION_ADD: {
                Device device = new Device(manualDevice.getNumberPort(),
                        manualDevice.getNumberSIM(),
                        "gsdgs");
//                deviceRepos.save(device);
                return "add";
            }
            case ACTION_DELETE: {
                return "delete";
            }
            case ACTION_MODIFY: {
                return "modify";
            }
            default: {
                return "Undefy action!!!";
            }
        }
    }
}
