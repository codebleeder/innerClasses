
public class OuterClass {
	// private members 
	private int a=1; 
	
	public int getA(){
		return a; 
	}
	
	// static inner class 
	static class InnerClass1 {
		private int b=2; 
		
		public int getB() {
			return b; 
		}
	
	}
	
	// non-static inner classes 
	class InnerClass2 {
		private int c=3; 
		
		public int getC(){
			return c; 
		}
	}
}
