package polymorphismconcepts;

public class MethodOverloadingTest4 {
	
	public static void main(){
		System.out.println("main without args");
	}
	
	public static void main(String args[]) {
		System.out.println("Main with args[]");
	}
	
	public static void main(String[] args){
		System.out.println("main with String[]");
	}  
	
	public static void main(String args){
		System.out.println("main with String");
	}  
}