package AtCoderBeginnerContest.no133.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 2\r\n" + "1 2\r\n" + "5 5\r\n" + "-2 8";
		String output = "1";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3 4\r\n" + "-3 7 8 2\r\n" + "-12 1 10 2\r\n" + "-2 8 9 3";
		String output = "2";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5 1\r\n" + "1\r\n" + "2\r\n" + "3\r\n" + "4\r\n" + "5";
		String output = "10";

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
