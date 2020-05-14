package AtCoderBeginnerContest.no103.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" +
				"3 4 6";
		String output = "10";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "5\r\n" +
				"7 46 11 20 11";
		String output = "90";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "7\r\n" +
				"994 518 941 851 647 2 581";
		String output = "4527";
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
