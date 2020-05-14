package AtCoderBeginnerContest.no157.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "84 97 66\r\n" +
				"79 89 11\r\n" +
				"61 59 7\r\n" +
				"7\r\n" +
				"89\r\n" +
				"7\r\n" +
				"87\r\n" +
				"79\r\n" +
				"24\r\n" +
				"84\r\n" +
				"30";
		String output = "Yes";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "41 7 46\r\n" +
				"26 89 2\r\n" +
				"78 92 8\r\n" +
				"5\r\n" +
				"6\r\n" +
				"45\r\n" +
				"16\r\n" +
				"57\r\n" +
				"17";
		String output = "No";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "60 88 34\r\n" +
				"92 41 43\r\n" +
				"65 73 48\r\n" +
				"10\r\n" +
				"60\r\n" +
				"43\r\n" +
				"88\r\n" +
				"11\r\n" +
				"48\r\n" +
				"73\r\n" +
				"65\r\n" +
				"41\r\n" +
				"92\r\n" +
				"34";
		String output = "Yes";
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
