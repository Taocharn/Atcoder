package AtCoderBeginnerContest.no132.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "6\r\n" +
				"9 1 4 4 6 7";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "8\r\n" +
				"9 1 14 5 5 4 4 14";
		String output = "0";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "14\r\n" +
				"99592 10342 29105 78532 83018 11639 92015 77204 30914 21912 34519 80835 100000 1";
		String output = "42685";

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
