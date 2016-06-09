package stringInsideClass;

public class From_another {

	static class Nested_Demo{
		public void my_method(){
			System.out.println("This is my nested class.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		From_another.Nested_Demo nested = new From_another.Nested_Demo();
		nested.my_method();
	}
	
	
}
