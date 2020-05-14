package AtCoderBeginnerContest.no163.e;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "4 4\r\n" + "....\r\n" + ".#..\r\n" + "..#.\r\n" + "....";
		String output = "1 4\r\n" + "1 4";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4 5\r\n" + "#....\r\n" + "#.#.#\r\n" + "#..#.\r\n" + "#.##.";
		String output = "4 10\r\n" + "3 8\r\n" + "1 4\r\n" + "1 4";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "3 5\r\n" + "##..#\r\n" + "##..#\r\n" + "...##";
		String output = "4 10\r\n" + "4 8";
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
