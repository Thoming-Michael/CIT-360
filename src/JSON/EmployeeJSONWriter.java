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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;


public class EmployeeJSONWriter {

	public static void mainOld(String[] args) throws FileNotFoundException {

            //create an instance of the Employee object and insert data as specified at the bottom of this page
		Employee emp = createEmployee();

                //create JSON objects needed for each type of data in the employee record
		JsonObjectBuilder empBuilder = Json.createObjectBuilder();
		JsonObjectBuilder addressBuilder = Json.createObjectBuilder();
		JsonArrayBuilder phoneNumBuilder = Json.createArrayBuilder();

		for (long phone : emp.getPhoneNumbers()) {
			phoneNumBuilder.add(phone);
		}
		
		addressBuilder.add("street", emp.getAddress().getStreet())
						.add("city", emp.getAddress().getCity())
						.add("zipcode", emp.getAddress().getZipcode());
		
		empBuilder.add("id", emp.getId()).add("name", emp.getName())
						 .add("permanent", emp.isPermanent())
                                                 .add("role", emp.getRole());
		
		empBuilder.add("phoneNumbers", phoneNumBuilder);
		empBuilder.add("address", addressBuilder);
		
		JsonObject empJsonObject = empBuilder.build();
		
		System.out.println("Employee JSON String\n"+empJsonObject);
		
		//write to file
		OutputStream os = new FileOutputStream("emp.txt");
		JsonWriter jsonWriter = Json.createWriter(os);
		/**
		 * We can get JsonWriter from JsonWriterFactory also
		JsonWriterFactory factory = Json.createWriterFactory(null);
		jsonWriter = factory.createWriter(os);
		*/
		jsonWriter.writeObject(empJsonObject);
		jsonWriter.close();
	}
	

	public static Employee createEmployee() {

            //Create the employee record with the following info (request user input if time allows
		Employee emp = new Employee();
		emp.setId(222);
		emp.setName("Gage Thoming");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 1234567, 9876543 });
		emp.setRole("Technician");

		Address add = new Address();
		add.setCity("Denver");
		add.setStreet("1581 S. Dale Ct.");
		add.setZipcode(80219);
		emp.setAddress(add);

		return emp;
	}

}
