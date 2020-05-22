package AtCoderBeginnerContest.no153.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 1\r\n" +
				"4 1 5";
		String output = "5";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "8 9\r\n" +
				"7 9 3 2 3 8 4 6";
		String output = "0";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "3 0\r\n" +
				"1000000000 1000000000 1000000000";
		String output = "3000000000";

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
