class Student{
    int age;
    String name;
    
    public void setname(String x){
        this.name = x;
    }
    
    public void setage(int y){
        this.age=y;
    }
    
    int getAge(){
        return this.age;
    }
    
    String getName(){
        return this.name;
    }
}

public class LE0
{
	public static void main(String[] args) {
	    Student obj1 = new Student();
	    obj1.setage(20);
	    obj1.setname("Mohit");
	    
	    System.out.println(obj1.getName() +" "+ obj1.getAge());
		System.out.println("Hello World");
	}
}
