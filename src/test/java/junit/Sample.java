package junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Sample {
@Before
public  void beforeclass() {
	System.out.println("Brouser configuration and launch...");
	
}
@AfterClass
public static void afterclass() {
System.out.println("close Browser");
}
@Before
public void beforeeachmethod() {
Date d = new Date();
System.out.println("start time:"+d);
}
@After
public void beforeEachmethod() {
	// TODO Auto-generated method stub
Date d = new Date();
System.out.println("End time:"+d);

}
@Test
public void tc1() {
System.out.println("tc1");
}
@Test
public void tc2() {
System.out.println("tc2");
}
@Test
public void tc3() {
System.out.println("tc3");
}
}
