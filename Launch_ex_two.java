package ex_two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Launch_ex_two {
	
	
//	private static List jobs = new TreeSet<Job>();
   private static Job_ex_two[] jobs; 

	/**
	 * @param args
	 */
	public void go(File a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	


public static void read_from_file(String f) throws FileNotFoundException {

	
    File int_input;
    int_input = new File(f);
	Scanner scanner = new Scanner(new FileReader(int_input));
    String s = scanner.nextLine();
    int counter = 0;
    int size = Integer.parseInt(s);
    System.out.println("Jobs specified in file: " + s);
    jobs = new Job_ex_two[size];
   
    
    do{
    	s = scanner.nextLine();
	    String[] tempList = s.split(" "); 
//	    System.out.println(s);
	    int weight = Integer.parseInt(tempList[0]);
	    int lenght = Integer.parseInt(tempList[1]);
//	    if (weight ==1 && lenght == 97) System.out.println(s);
	    jobs[counter++] = new Job_ex_two(weight,lenght); //set the values, factor
	    
    }while (scanner.hasNextLine());
   
    System.out.println(counter + " jobs treated.");
    
    scanner.close();

}

public static void result(boolean debug){

	System.out.println("Jobs inserted: "+ jobs.length);
	
	long lenght_acum = 0;
	long acum_exec = 0 ;
	
	Arrays.sort(jobs);
    System.out.println("Jobs specified in data: " + jobs.length);
    
    for(int i=0;i<jobs.length;i++){
    	
    	if(debug){
//			System.out.println("Job " + i + " factor: " +jobs[i].getFactor() ); 
//			System.out.println("Job " + i + " weight: " + jobs[i].getWeight() ); 
//			System.out.println("Job " + i + " lenght: " + jobs[i].getLenght() ); 
			System.out.println("Job " + i + " acum_exec: " + acum_exec ); 
			System.out.println("Job " + i + " lenght_acum: " + lenght_acum ); 
    	}

    	lenght_acum = lenght_acum + jobs[i].getLenght() ;
    	
    	
    	acum_exec = (long) (jobs[i].getWeight() *  lenght_acum) + acum_exec;
    	
    	
    }
    System.out.println("Acumulated execution using ratio as factor is:     " +  Long.toString(acum_exec));
   	
//	int i = 0;
//	for (Job_ex_two temp: jobs){
//		
//		lenght_acum = lenght_acum + temp.getLenght() ;
//		if(debug){
//			System.out.println("Job " + i + " end time: " + lenght_acum );
//			System.out.println("Job " + i + " factor: " +temp.getFactor() ); 
//			System.out.println("Job " + i + " weight: " + temp.getWeight() ); 
//			System.out.println("Job " + i++ + " lenght: " + temp.getLenght() ); 
//		}
//		acum_exec = (temp.getWeight() * lenght_acum) + acum_exec ;
//	}
	
	
}
}
