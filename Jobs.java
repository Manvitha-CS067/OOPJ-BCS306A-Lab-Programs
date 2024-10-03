class Human{
	public void job(){
        	System.out.println("Working Professional");
	}
}
class Teacher extends Human{
	public void job(){                 
        	System.out.println("Teacher");
	}
}
class Doctor extends Human{
	public void job(){
        	System.out.println("Doctor");
	}
}
public class Jobs{
	public static void main(String[] args){
        	Human manvitha=new Human();
        	Teacher ashwini=new Teacher();
        	Doctor yashaswini=new Doctor();
        	Human geetha= new Doctor();  
        	manvitha.job();
        	ashwini.job();
        	yashaswini.job();
        	geetha.job();
	}
}