package org.test;

import org.testng.annotations.Test;

public class Groups {
@Test(groups="smoke")
public void tc1() {
System.out.println("tc1");
}
@Test(groups="sanity")
public void tc2() {
System.out.println("tc2");

}
@Test(groups="reg")
public void tc3() {
System.out.println("tc3");
}
}
