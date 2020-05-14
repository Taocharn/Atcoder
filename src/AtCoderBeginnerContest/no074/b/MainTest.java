package AtCoderBeginnerContest.no074.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "1\r\n" + "10\r\n" + "2";
		String output = "4";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "2\r\n" + "9\r\n" + "3 6";
		String output = "12";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5\r\n" + "20\r\n" + "11 12 9 17 12";
		String output = "74";
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
