package JunitTest.MathTest;

import static org.junit.Assert.*;
import javax.management.RuntimeErrorException;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.AssertionFailedError;

public class SimpleMathTest {

	@Test
	public void test() {
		int x=50, y =20;
		int result = SimpleMath.plus(x, y);
		System.out.println("plus"+result);
		/*
		 * if(result != x+y) { throw new RuntimeException("Plus Opertion failed"); }
		 */
		Assert.assertEquals(x+y, result);
	}
	@Test
	public void test1() {
		int x=100, y =20;
		int result = SimpleMath.sub(x, y);
		System.out.println("plus"+result);
		/*
		 * if(result != x+y) { throw new RuntimeException("sub Opertion failed"); }
		 */
		Assert.assertEquals(x-y, result);

	}
	@Test
	public void test2() {
		int x=100, y =20;
		int result = SimpleMath.mul(x, y);
		System.out.println("plus"+result);
		/*
		 * if(result != x*y) { throw new RuntimeException("Mul Opertion failed"); }
		 */
		Assert.assertEquals(x*y, result);

	}
	@Test
	public void test3() {
		int x=100, y =20;
		int result = SimpleMath.div(x, y);
		System.out.println("plus"+result);
		/*
		 * if(result != x/y) { throw new AssertionFailedError("Div Opertion failed"); }
		 */
		Assert.assertEquals(x/y, result);

	}

}
