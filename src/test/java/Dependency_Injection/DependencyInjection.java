package Dependency_Injection;

import org.testng.annotations.Test;

public class DependencyInjection{
	@Test
	public void maven_profile_test() {
		System.out.println("value passing using maven profiles is "+ "testing platform is :"+System.getProperty("testtype"));
		System.out.println("value passing using maven profiles is "+ "TestRunner File is :"+System.getProperty("test_tunner"));
		System.out.println("value passing using maven profiles is "+ "TestRunner File is :"+System.getProperty("name"));
	}
	
	
}