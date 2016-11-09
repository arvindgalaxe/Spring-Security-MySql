package com.katte.galaxe.Java2Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Gson2Java {
	public static void main(String[] args) {
		Gson mygson = new Gson();
		try
		{
			Reader reader = new FileReader("D:\\jsonfile.json");
			JavaObjects myobj = mygson.fromJson(reader,JavaObjects.class);
			System.out.println(myobj);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
}
