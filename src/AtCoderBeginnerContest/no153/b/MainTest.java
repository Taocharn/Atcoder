package AtCoderBeginnerContest.no153.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "10 3\r\n" + "4 5 6";
		String output = "Yes";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "20 3\r\n" + "4 5 6";
		String output = "No";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "210 5\r\n" + "31 41 59 26 53";
		String output = "Yes";

		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "211 5\r\n" + "31 41 59 26 53";
		String output = "No";

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
