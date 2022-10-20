package com.ttnemployee.Employeerestapi.exception;


import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    @Getter
   private LocalDateTime timestamp;
    @Getter
   private String Message;
   private String Details;

   public  ErrorDetails(LocalDateTime timestamp, String Message, String Details){
                 super();
                 this.timestamp = timestamp;
                 this.Message = Message;
                 this.Details = Details;
   }
}
