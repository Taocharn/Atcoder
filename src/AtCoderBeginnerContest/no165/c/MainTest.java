package AtCoderBeginnerContest.no165.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 4 3\r\n" + "1 3 3 100\r\n" + "1 2 2 10\r\n" + "2 3 2 10";
		String output = "110";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4 6 10\r\n" + "2 4 1 86568\r\n" + "1 4 0 90629\r\n" + "2 3 0 90310\r\n" + "3 4 1 29211\r\n"
				+ "3 4 3 78537\r\n" + "3 4 2 8580\r\n" + "1 2 1 96263\r\n" + "1 4 2 2156\r\n" + "1 2 0 94325\r\n"
				+ "1 4 3 94328";
		String output = "357500";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "10 10 1\r\n" + "1 10 9 1";
		String output = "1";
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
