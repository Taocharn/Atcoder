package AtCoderBeginnerContest.no142.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "4 150\r\n" + "150 140 100 200";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1 500\r\n" + "499";
		String output = "0";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5 1\r\n" + "100 200 300 400 500";
		String output = "5";

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
