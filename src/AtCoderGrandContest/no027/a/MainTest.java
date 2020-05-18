package AtCoderGrandContest.no027.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 70\r\n" + "20 30 10";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3 10\r\n" + "20 30 10";
		String output = "1";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "4 1111\r\n" + "1 10 100 1000";
		String output = "4";

		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "2 10\r\n" + "20 20";
		String output = "0";

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
