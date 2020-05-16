package AtCoderBeginnerContest.no142.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" +
				"2 3 1";
		String output = "3 1 2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "5\r\n" +
				"1 2 3 4 5";
		String output = "1 2 3 4 5";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "8\r\n" +
				"8 2 7 3 4 5 6 1";
		String output = "8 2 4 5 6 7 3 1";

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
