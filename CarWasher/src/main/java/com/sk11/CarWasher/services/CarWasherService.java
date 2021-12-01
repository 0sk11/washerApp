package com.sk11.CarWasher.services;

import com.sk11.CarWasher.repository.WasherRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CarWasherService {
    @Autowired
    private WasherRepo washerRepo;
}
