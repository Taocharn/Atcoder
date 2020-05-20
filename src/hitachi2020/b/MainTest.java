package hitachi2020.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2 3 1\r\n" + "3 3\r\n" + "3 3 3\r\n" + "1 2 1";
		String output = "5";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1 1 2\r\n" + "10\r\n" + "10\r\n" + "1 1 5\r\n" + "1 1 10";
		String output = "10";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "2 2 1\r\n" + "3 5\r\n" + "3 5\r\n" + "2 2 2";
		String output = "6";

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
