package AtCoderBeginnerContest.no092.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "7 1\r\n" + "2\r\n" + "5\r\n" + "10";
		String output = "8";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "2\r\n" + "8 20\r\n" + "1\r\n" + "10";
		String output = "29";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5\r\n" + "30 44\r\n" + "26\r\n" + "18\r\n" + "81\r\n" + "18\r\n" + "6";
		String output = "56";

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
