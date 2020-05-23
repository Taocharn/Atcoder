package AtCoderBeginnerContest.no083.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "20 2 5";
		String output = "84";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "10 1 2";
		String output = "13";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "100 4 16";
		String output = "4554";

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
