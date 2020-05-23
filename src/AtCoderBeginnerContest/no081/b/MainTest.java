package AtCoderBeginnerContest.no081.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "8 12 40";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4\r\n" + "5 6 8 10";
		String output = "0";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "6\r\n" + "382253568 723152896 37802240 379425024 404894720 471526144";
		String output = "8";

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
