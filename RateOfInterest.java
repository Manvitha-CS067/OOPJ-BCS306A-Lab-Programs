class Bank2{                    
	int getInterestRate(){
	return 0;}
	}
class Canara extends Bank2{
	int getInterestRate(){
        return 5;}
	}
class SBI extends Bank2{        
	int getInterestRate(){      
        return 6;}
	}
class SCDCC extends Bank2{
	int getInterestRate(){
        return 8;}
	}
public class RateOfInterest{
    public static void main(String[] args){
        Canara bank1=new Canara();    
        SBI bank2 = new SBI();
        SCDCC bank3 = new SCDCC();
        System.out.println("Bank 1: " + bank1.getInterestRate() + " %");
        System.out.println("Bank 2: " + bank2.getInterestRate() + " %");
        System.out.println("Bank 3: " + bank3.getInterestRate() + " %");
	}
}