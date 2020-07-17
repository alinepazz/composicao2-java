package aplication;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner c = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name:");
		String department = c.nextLine();
		Department depart = new Department(department);
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String name = c.nextLine();
		
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(c.nextLine());
		
		System.out.print("Base salary:");
		double salary = c.nextDouble();
		
		Worker worker = new Worker(name, level, salary);
		
		

		c.close();

	}

}
