package task8;
import static org.junit.Assert.*;
import org.junit.Test;

public class String_CorrectionTest {

	@Test
	public void test1() {
		assertEquals("BCD",String_Correction.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",String_Correction.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",String_Correction.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",String_Correction.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",String_Correction.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",String_Correction.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",String_Correction.del("A"));
	}

}
