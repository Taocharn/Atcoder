package AtCoderBeginnerContest.no141.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "6 3 4\r\n" + "3\r\n" + "1\r\n" + "3\r\n" + "2";
		String output = "No\r\n" + "No\r\n" + "Yes\r\n" + "No\r\n" + "No\r\n" + "No";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "6 5 4\r\n" + "3\r\n" + "1\r\n" + "3\r\n" + "2";
		String output = "Yes\r\n" + "Yes\r\n" + "Yes\r\n" + "Yes\r\n" + "Yes\r\n" + "Yes";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "10 13 15\r\n" + "3\r\n" + "1\r\n" + "4\r\n" + "1\r\n" + "5\r\n" + "9\r\n" + "2\r\n" + "6\r\n"
				+ "5\r\n" + "3\r\n" + "5\r\n" + "8\r\n" + "9\r\n" + "7\r\n" + "9";
		String output = "No\r\n" + "No\r\n" + "No\r\n" + "No\r\n" + "Yes\r\n" + "No\r\n" + "No\r\n" + "No\r\n"
				+ "Yes\r\n" + "No";
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
