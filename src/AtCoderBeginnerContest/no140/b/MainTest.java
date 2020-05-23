package AtCoderBeginnerContest.no140.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "3 1 2\r\n" + "2 5 4\r\n" + "3 6";
		String output = "14";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4\r\n" + "2 3 4 1\r\n" + "13 5 8 24\r\n" + "45 9 15";
		String output = "74";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "2\r\n" + "1 2\r\n" + "50 50\r\n" + "50";
		String output = "150";

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
