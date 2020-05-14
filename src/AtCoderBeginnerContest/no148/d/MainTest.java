package AtCoderBeginnerContest.no148.d;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "2 1 2";
		String output = "1\r\n" + "";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3\r\n" + "2 2 2";
		String output = "-1\r\n" + "";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "10\r\n" + "3 1 4 1 5 9 2 6 5 3";
		String output = "7\r\n" + "";
		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "1\r\n" + "1";
		String output = "0\r\n" + "";
		assertIO(input, output);
	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output, out.toString());
	}
}
