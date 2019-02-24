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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.stream.JsonGenerator;


public class EmployeeJSONGenerator {

	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("emp_output.txt");
		JsonGenerator jsonGenerator = Json.createGenerator(fos);

		
		Employee emp = EmployeeJSONWriter.createEmployee();
		jsonGenerator.writeStartObject(); // {
		jsonGenerator.write("id", emp.getId()); // "id":123
		jsonGenerator.write("name", emp.getName());
		jsonGenerator.write("role", emp.getRole());
		jsonGenerator.write("permanent", emp.isPermanent());
		
		jsonGenerator.writeStartObject("address") //start of address object
			.write("street", emp.getAddress().getStreet())
			.write("city",emp.getAddress().getCity())
			.write("zipcode",emp.getAddress().getZipcode())
			.writeEnd(); //end of address object
		
		jsonGenerator.writeStartArray("phoneNumbers"); //start of phone num array
		for(long num : emp.getPhoneNumbers()){
			jsonGenerator.write(num);
		}
		jsonGenerator.writeEnd(); // end of phone num array
		jsonGenerator.writeEnd(); // }
		
		jsonGenerator.close();
		
	}

}
