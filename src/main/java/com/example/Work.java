package com.example;

import com.example.dto.List;
import com.example.dto.Root;
import com.example.dto.Sys;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.checkerframework.checker.units.qual.C;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.sql.Timestamp;

public class Work {


private static Root root;
public void setup() throws IOException {

    String response=getResponse();
    ObjectMapper objectMapper=new ObjectMapper();
     root=objectMapper.readValue(response, Root.class);
    System.out.println(root.getList().get(0).getDt_txt());
}


    private  String getResponse() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public void getWeather(String date){

        Timestamp currentTime = CommonsUtils.stringToTimeStamp(date);
        for(List list : root.getList()){
            String dt_txt = list.getDt_txt();
            Timestamp theirTime = CommonsUtils.stringToTimeStamp(dt_txt);
            if(theirTime.compareTo(currentTime) == 0){
                    list.getWeather().stream().forEach(weather -> {
                        System.out.println(weather.getDescription());
                    });
            }
        }

    }

    public void getWindSpeed(String date) {
        Timestamp currentTime = CommonsUtils.stringToTimeStamp(date);
        for (List list : root.getList()) {
            String dt_txt = list.getDt_txt();
            Timestamp theirTime = CommonsUtils.stringToTimeStamp(dt_txt);
            if (theirTime.compareTo(currentTime) == 0) {
                System.out.println(list.getWind().getSpeed());
            }
        }
    }

    public void getPressure(String date) {
        Timestamp currentTime = CommonsUtils.stringToTimeStamp(date);
        for (List list : root.getList()) {
            String dt_txt = list.getDt_txt();
            Timestamp theirTime = CommonsUtils.stringToTimeStamp(dt_txt);
            if (theirTime.compareTo(currentTime) == 0) {
                System.out.println(list.getMain().getPressure());
            }
        }
    }
}
