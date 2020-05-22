package AtCoderBeginnerContest.no150.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "1 3 2\r\n" + "3 1 2";
		String output = "3";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "8\r\n" + "7 3 5 4 2 1 6 8\r\n" + "3 8 2 5 4 6 7 1";
		String output = "17517";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "3\r\n" + "1 2 3\r\n" + "1 2 3";
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
