package com.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.example.dto.Sys;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.codehaus.jackson.map.ObjectMapper;

import com.example.dto.Root;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main {





	public static void main(String[] args) throws IOException {

Work work = new Work();
work.setup();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice");
			int res = scanner.nextInt();
			if(res==0)
				break;
			System.out.println("Enter date in format ->      yyyy-MM-dd HH:mm:ss ");
			String date = scanner.nextLine();
			date=scanner.nextLine();
				if(res==1){

					work.getWeather(date);
				}
				else if(res==3){

					work.getPressure(date);
				}
				else if(res==2){

					work.getWindSpeed(date);
				}

				else
					System.out.println("enter valid choice");
		}

	}
	


}
