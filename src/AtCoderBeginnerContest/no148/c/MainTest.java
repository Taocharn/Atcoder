package AtCoderBeginnerContest.no148.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2 3";
		String output = "6";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "123 456";
		String output = "18696";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "100000 99999";
		String output = "9999900000";
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
