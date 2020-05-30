package nomura2020.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" +
				"0 1 1 2";
		String output = "7";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4\r\n" +
				"0 0 1 0 2";
		String output = "10";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "2\r\n" +
				"0 3 1";
		String output = "-1";
		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "1\r\n" +
				"1 1";
		String output = "-1";
		assertIO(input, output);
	}

	@Test
	public void test5() throws Exception {
		String input = "10\r\n" +
				"0 0 1 1 2 3 5 8 13 21 34";
		String output = "264";
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
