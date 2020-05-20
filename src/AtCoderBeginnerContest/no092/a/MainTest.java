package AtCoderBeginnerContest.no092.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "600\r\n" +
				"300\r\n" +
				"220\r\n" +
				"420";
		String output = "520";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "555\r\n" +
				"555\r\n" +
				"400\r\n" +
				"200";
		String output = "755";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "549\r\n" +
				"817\r\n" +
				"715\r\n" +
				"603";
		String output = "1152";

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
