package reflectionTests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class QuickTests {

	public static void main(String[] args) {
		
		try {
			Method method = QuickTests.class.getMethod("testInt", Integer.class);
			method.invoke(new QuickTests(), 2);
			
			new QuickTests().testInt(Integer.valueOf(1));
			new QuickTests().testInt(1);
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void testInt(Integer int1){
		System.out.println("test Integer");
		
	}
	
	public void testInt(int int1){
		System.out.println("test int");
	}

}
