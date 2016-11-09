package com.katte.galaxe.Java2Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import com.google.gson.Gson;

public class Java2Gson 
{
    public static void main( String[] args )
    {
    	JavaObjects obj = new JavaObjects();
    	obj.setFname("Arvind");
    	obj.setLname("Katte");
    	obj.setAge(new Integer(25));
    	obj.setDob(new Date());
    	Gson mygson = new Gson();
    	String jsonformat = mygson.toJson(obj);
        System.out.println(jsonformat);
        try {
			FileWriter writer = new FileWriter("D:\\jsonfile.json");
			writer.write(jsonformat);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
