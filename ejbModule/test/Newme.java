package test;

public class Newme {
	//private String name;
	//private String age;
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void sayHello(){
		System.out.println("Hello,the new world!"+"I am "+this.name+","+"I am "+this.age+ " years old");
		
	}
}
