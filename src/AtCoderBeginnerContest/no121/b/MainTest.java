package AtCoderBeginnerContest.no121.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2 3 -10\r\n" +
				"1 2 3\r\n" +
				"3 2 1\r\n" +
				"1 2 2";
		String output = "1";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "5 2 -4\r\n" +
				"-2 5\r\n" +
				"100 41\r\n" +
				"100 40\r\n" +
				"-3 0\r\n" +
				"-6 -2\r\n" +
				"18 -13";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "3 3 0\r\n" +
				"100 -100 0\r\n" +
				"0 100 100\r\n" +
				"100 100 100\r\n" +
				"-100 100 100";
		String output = "0";
		assertIO(input, output);
	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output + System.lineSeparator(), out.toString());
	}
}
