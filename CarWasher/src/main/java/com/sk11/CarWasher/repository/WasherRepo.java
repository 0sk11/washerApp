package com.sk11.CarWasher.repository;

import com.sk11.CarWasher.model.WashModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WasherRepo extends MongoRepository<WashModel,Long> {
}
