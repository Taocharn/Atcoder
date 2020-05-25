package AtCoderBeginnerContest.no108.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "0 0 0 1";
		String output = "-1 1 -1 0";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "2 3 6 6";
		String output = "3 10 -1 7";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "31 -41 -59 26";
		String output = "-126 -64 -36 -131";
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
