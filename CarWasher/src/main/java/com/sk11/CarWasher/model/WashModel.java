package com.sk11.CarWasher.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "carWasher")
public class WashModel {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;
    private String customerName;
    private String customerPlace;
    private String customerAddress;
    private String customerRating;
    private String time;
    private String addOns;
}
