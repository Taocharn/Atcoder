package AtCoderBeginnerContest.no166.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "4 3\r\n" + "1 2 3 4\r\n" + "1 3\r\n" + "2 3\r\n" + "2 4";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "6 5\r\n" + "8 6 9 1 2 1\r\n" + "1 3\r\n" + "4 2\r\n" + "4 3\r\n" + "4 6\r\n" + "4 6";
		String output = "3";
		assertIO(input, output);
	}

//	@Test
//	public void test3() throws Exception {
//		String input = "10 10 1\r\n" + "1 10 9 1";
//		String output = "1";
//		assertIO(input, output);
//	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output + System.lineSeparator(), out.toString());
	}
}
