package encryptor1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShiftMultiplyEncryptionTest {

	@Test
	public void test1() {
		ShiftMultiplyEncryption shift = new  ShiftMultiplyEncryption('E', 1);
		String res = shift.encryptText("abc");
		System.out.println(res);
		assertEquals("abc", res);
	}
	
	
	@Test
	public void test2() {
		ShiftMultiplyEncryption shift = new  ShiftMultiplyEncryption('E', 2);
		int key = shift.getKey();
		assertEquals(2, key);
	}

}
