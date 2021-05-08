package com.softserve.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.softserve.edu.service.DigitalService;
import com.softserve.edu.service.OperationService;

@Service
@Qualifier("SubOperationService")
public class SubOperationService implements OperationService {

    @Autowired
    private DigitalService digitalService;

//    @Autowired
//    public SubOperationService(DigitalService digitalService) {
//        this.digitalService = digitalService;
//    }

    public String operation(String arg0, String arg1) {
        return String.valueOf(digitalService.toInt(arg0) - digitalService.toInt(arg1));
    }

}