package AtCoderBeginnerContest.no156.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "11 2";
		String output = "4";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1010101 10";
		String output = "7";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "314159265 3";
		String output = "18";
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
