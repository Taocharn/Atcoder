package AtCoderBeginnerContest.no166.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 2\r\n" + "2\r\n" + "1 3\r\n" + "1\r\n" + "3";
		String output = "1";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3 3\r\n" + "1\r\n" + "3\r\n" + "1\r\n" + "3\r\n" + "1\r\n" + "3";
		String output = "2";
		assertIO(input, output);
	}

//	@Test
//	public void test3() throws Exception {
//		String input = "1000000000000000000";
//		String output = "3760";
//		assertIO(input, output);
//	}

//
//	@Test
//	public void test4() throws Exception {
//		String input = "314 15\r\n" +
//				"9 26 5 35 8 9 79 3 23 8 46 2 6 43 3";
//		String output = "9";
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
