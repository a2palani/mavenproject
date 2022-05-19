package org.test;

import org.testng.annotations.Test;

public class Paralleltest2 {
	@Test
	public void tc10() {
System.out.println("tc100.."+Thread.currentThread().getId());

	}
	@Test
	public void tc20() {
System.out.println("tc200.."+Thread.currentThread().getId());

}
	@Test
	public void tc30() {
System.out.println("tc300.."+Thread.currentThread().getId());
	}
}

