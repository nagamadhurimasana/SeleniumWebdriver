package DDTProject;

import org.junit.Test;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class TestAnnotations {
	
	@Test
	public void test1() {
		System.out.println("Executing Test1");
	}
	
	public void test2() {
		System.out.println("Executing Test2");
	}

	@BeforeTest
	public void befortest() {
		System.out.println("Before Executing Test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Before Executing Test");
	}
	
}
