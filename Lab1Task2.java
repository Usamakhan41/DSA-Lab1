import java.util.Scanner;
class Employee{
//Instance Variables
int salary;
int hour;
	//getInfo Method
	public void getInfo(int salary, int hour){
		this.salary=salary;
        this.hour=hour;
        System.out.println("salary is " + salary);
        System.out.println("Hours are " + hour);		 
 
	}
	//addSalary Method
	public void addSalary(){
		if(salary<500){
			salary=salary+10;
			System.out.println("Salary is now " + salary);
		}
		else 
		System.out.println(salary);

	}
	//addWorkHourBonus Method
	public void addWorkHourBonus(){

		if(hour<5){

			salary=salary+5;
			System.out.println("Now salary is " + salary);
		}
		else
		System.out.println(salary);

	}
	//Main Method
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
    Employee obj=new Employee();
    System.out.println("Enter your Salary");
    int salary=sc.nextInt();
      System.out.println("Enter your hours");
    int hour=sc.nextInt();	
obj.getInfo(salary,hour);
    obj.addSalary();
    obj.addWorkHourBonus();

	}

}