package org.test;

import org.testng.annotations.Test;

public class Group2 {
@Test(groups="reg")
public void tc100() {
System.out.println();
}
@Test(groups="sanity")
public void tc200() {
System.out.println("tc200");
}
@Test(groups="smoke")
public void tc300() {
System.out.println("tc300");
}

}
