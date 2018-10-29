
public class MethodCalling {
	
	//Static component --> can not give a call to non-static component directly
	//static -->static(allowed)
	//non static --> non static ,static (allowed)
	//non static components cannot be called without making an object
	// static --> 00

	public static void main(String[] args) {
		
		MethodCalling m = new MethodCalling();
		//m.go();
		m.go1();
		//m.go2();
		//go3();
		
		/*
		 * inside go1 method
		 * Inside Go method
		 * Inside go2 Method
		 * after calling go2 method
		 * after calling go method
		 * after calling go1 method
		 */
		
		
	System.out.println("after calling go1 method");	
		

	}
	public static void go3() {
	System.out.println("Inside Go3 Method");
	}

	
	public void go(){
		System.out.println("Inside Go Method");
		go2();
		System.out.println("after calling go2 Method");
	}
	
	public void go1(){
		System.out.println("Inside Go1 Method");
		go();
		System.out.println("after calling go method");
	
	}
	public static void go2(){
		System.out.println("Inside Go2 Method");
		
	}
}
