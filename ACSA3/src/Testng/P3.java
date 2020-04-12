package Testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class P3 {
	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}
	@Test
	public void method1() {
		System.out.println("method1");
	}
	@Test
	public void method2() {
		System.out.println("method2");
	}
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	@AfterClass
	public void ac() {
		System.out.println("after class");
	}
	

}
