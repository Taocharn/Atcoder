package AtCoderBeginnerContest.no138.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2\r\n" +
				"10 30";
		String output = "7.5";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3\r\n" +
				"200 200 200";
		String output = "66.66666666666667";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "1\r\n" +
				"1000";
		String output = "1000";

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
