
public class InnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of outerclass
		// all classes instantiated with their functions invoked 
		
		OuterClass o = new OuterClass(); 
		OuterClass.InnerClass1 i = new OuterClass.InnerClass1(); 
		OuterClass.InnerClass2 j = o.new InnerClass2(); 
		
		System.out.println(o.getA()); 
		System.out.println(i.getB());
		System.out.println(j.getC());
	}

}
