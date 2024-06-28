package com.explore.springdatajdbc.paymentservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//@Entity
//@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

//    @Id
    private int paymentId;
    private  String paymentStatus;
    private  String transactionId;


}
