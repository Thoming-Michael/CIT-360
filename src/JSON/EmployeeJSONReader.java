/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

/**
 *
 * @author mthoming
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import JSON.Address;


public class EmployeeJSONReader {

	public static final String JSON_FILE="C:/Users/mthoming/Documents/NetBeansProjects/CIT 360/src/JSON/employee.txt";
	
	public static void mainOld(String[] args) throws IOException {
		InputStream fis = new FileInputStream(JSON_FILE);
		
		//create JsonReader object
		JsonReader jsonReader = Json.createReader(fis);
		
		//get JsonObject from JsonReader
		JsonObject jsonObject = jsonReader.readObject();
		
		//close IO resource and JsonReader
		jsonReader.close();
		fis.close();
		
		//Retrieve data from JsonObject and create Employee instance
		Employee emp = new Employee();
		
		emp.setId(jsonObject.getInt("id"));
		emp.setName(jsonObject.getString("name"));
		emp.setPermanent(jsonObject.getBoolean("permanent"));
		emp.setRole(jsonObject.getString("role"));
		
		//read list of phone numbers from json file
		JsonArray jsonArray = jsonObject.getJsonArray("phoneNumbers");
		long[] numbers = new long[jsonArray.size()];
		int index = 0;
		for(JsonValue value : jsonArray){
			numbers[index++] = Long.parseLong(value.toString());
		}
		emp.setPhoneNumbers(numbers);
		
		//reading inner object from json object
		JsonObject innerJsonObject = jsonObject.getJsonObject("address");
		Address address = new Address();
		address.setStreet(innerJsonObject.getString("street"));
		address.setCity(innerJsonObject.getString("city"));
		address.setZipcode(innerJsonObject.getInt("zipcode"));
		emp.setAddress(address);
		
		//print employee bean information
		System.out.println(emp);
		
	}

}
