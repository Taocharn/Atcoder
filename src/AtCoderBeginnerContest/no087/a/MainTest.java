package AtCoderBeginnerContest.no087.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "1234\r\n" + "150\r\n" + "100";
		String output = "84";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1000\r\n" + "108\r\n" + "108";
		String output = "28";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "579\r\n" + "123\r\n" + "456";
		String output = "0";
		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "7477\r\n" + "549\r\n" + "593";
		String output = "405";
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
