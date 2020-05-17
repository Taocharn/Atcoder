package AtCoderBeginnerContest.no058.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "xyz\r\n" +
				"abc";
		String output = "xaybzc";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "atcoderbeginnercontest\r\n" +
				"atcoderregularcontest";
		String output = "aattccooddeerrbreeggiunlnaerrccoonntteesstt";

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
