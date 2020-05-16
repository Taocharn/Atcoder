package AtCoderBeginnerContest.no142.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "4";
		String output = "0.5000000000";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "5";
		String output = "0.6000000000";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "1";
		String output = "1.0000000000";

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
