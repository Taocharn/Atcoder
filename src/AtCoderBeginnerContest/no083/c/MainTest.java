package AtCoderBeginnerContest.no083.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 20";
		String output = "3";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "25 100";
		String output = "3";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "314159265 358979323846264338";
		String output = "31";

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
