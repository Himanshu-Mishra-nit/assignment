package com.example;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonsUtils {

    public static Timestamp stringToTimeStamp(String date){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(date));
        return Timestamp.valueOf(localDateTime);
    }

}
