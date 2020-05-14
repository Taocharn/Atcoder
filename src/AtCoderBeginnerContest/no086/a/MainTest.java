package AtCoderBeginnerContest.no086.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 4";
		String output = "Even";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1 21";
		String output = "Odd";
		assertIO(input, output);
	}

//	@Test
//	public void test3() throws Exception {
//		String input = "60 88 34\r\n" +
//				"92 41 43\r\n" +
//				"65 73 48\r\n" +
//				"10\r\n" +
//				"60\r\n" +
//				"43\r\n" +
//				"88\r\n" +
//				"11\r\n" +
//				"48\r\n" +
//				"73\r\n" +
//				"65\r\n" +
//				"41\r\n" +
//				"92\r\n" +
//				"34";
//		String output = "Yes";
//		assertIO(input, output);
//	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output + System.lineSeparator(), out.toString());
	}
}
