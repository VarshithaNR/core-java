 1) class is a blueprint that is used to create an object
	class College{
		//body variables and methods
	}
	
 2) class Car{
	String brand;
	String model;
	int year;
	
	void display(){
		System.out.println("brand "+brand);
		System.out.println("model "+model);
		System.out.println("year "+year);
	}
  }
  
  class CarRunner{
	  public static void main(String[] args){
		  Car car = new Car("BMW","Su19td",1978);
		  car.display();
	  }
  }
  
 3) Methods are a block of code that performs specific task declared inside the class
		class Car{
	String brand;
	String model;
	int year;
	
	void display(){ // this is the methods
		System.out.println("brand "+brand);
		System.out.println("model "+model);
		System.out.println("year "+year);
	}
  }
  
 4) Method overloading is a type of polymorphism where it consists of several 
   method of similar name but different in there parameters
		class Add(int a , int b){
			return a+b;
		}
		class Add(int a, int b, int c){
			return a+b+c;
		}
  
 5) Constructor is a special type of method that is used to initaize the object it uses the new keyword for it,
  it has same name as class name without any access specifiers
		class Work{
			int a;
			
			Work(){//this is a constructor
				
			}
		}
 
 6) types of constructor are:
							default
							parameterized
							
 7) this reffers to the current object of the class. it is maily used to distinguish between the instance variable
   and parameters or to call other constructor or method
   
 8)  class Car{
	String brand;
	String model;
	int year;
	
	Car(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	void display(){
		System.out.println("brand "+this.brand);
		System.out.println("model "+this.model);
		System.out.println("year "+this.year);
	}
  }
  
  class CarRunner{
	  public static void main(String[] args){
		  Car car = new Car("BMW","Su19td",1978);
		  car.display();
	  }
  }
  
 9) class Print1{
	 public static void main(String[] args){
		 int rows = 5;
		 
		 for(int i=1;i<=rows;i++){
			 for(int j=1;j<=rows;j++){
				 System.out.print("* ");
			 }
		 }
		 System.out.println();
	 }
	 
 }
 
 10) class Print2{
	 public static void main(String[] args){
		 int rows = 5;
		 
		 for(int i=1;i<=rows;i++){
			 for(int j=1;j<=rows-1;j++){
				 System.out.print(" ");
			 }
			 for(int k = 1;k<=i;k++){
				 System.out.print("* ");
			 }
		 }
		 System.out.println();
	 }
		
 }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  