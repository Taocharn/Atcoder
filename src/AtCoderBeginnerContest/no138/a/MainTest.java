package AtCoderBeginnerContest.no138.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3200\r\n" +
				"pink";
		String output = "pink";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3199\r\n" +
				"pink";
		String output = "red";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "4049\r\n" +
				"red";
		String output = "red";

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
