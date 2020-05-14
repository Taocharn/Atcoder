package AtCoderBeginnerContest.no164.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "5\r\n" + "1 1 2 2";
		String output = "2\r\n" +
				"2\r\n" +
				"0\r\n" +
				"0\r\n" +
				"0";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "10\r\n" + "1 1 1 1 1 1 1 1 1";
		String output = "9\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "7\r\n" + "1 2 3 4 5 6";
		String output = "1\r\n" + "1\r\n" + "1\r\n" + "1\r\n" + "1\r\n" + "1\r\n" + "0";
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
