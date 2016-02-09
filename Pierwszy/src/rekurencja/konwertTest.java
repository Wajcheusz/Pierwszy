package rekurencja;

import static org.junit.Assert.*;

import org.junit.Test;

public class konwertTest {

	@Test
	public void testA1() {
		konwert a = new konwert();
		int result = a.a1(2, 2);
		assertEquals(1, result);
	}

}
