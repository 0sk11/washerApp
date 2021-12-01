package com.sk11.CarWasher.Controller;

import com.sk11.CarWasher.repository.WasherRepo;
import com.sk11.CarWasher.services.CarWasherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/carwasher")
public class CarWasherController {
    @Autowired
    private CarWasherService carWasherService;
//    @GetMapping(/)
}
