package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner c = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sds = new SimpleDateFormat("MM/YYYY");
		
		System.out.print("Enter department's name:");
		String department = c.nextLine();
	
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String name = c.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = c.nextLine();
		
		System.out.print("Base salary:");
		double salary = c.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), salary, new Department(department));
		
		System.out.println("How many contracts to this worker?");
		int contract = c.nextInt();
		
		for(int i=1; i <=contract; i++) {
			System.out.println("Enter contract #"+ i + "data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(c.next());
			
			System.out.print("Value per hour:");
			double valuePerHour = c.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hora = c.nextInt();
			
			HourContract contracts = new HourContract(date, valuePerHour, hora);
			worker.addContract(contracts);
			
			System.out.print("Enter month and year to calculate income (MM/YYYY):");
			Date date1 = sds.parse(c.next());
			
			
		}

		c.close();

	}

}
