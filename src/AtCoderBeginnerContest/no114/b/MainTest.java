package AtCoderBeginnerContest.no114.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "1234567876";
		String output = "34";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "35753";
		String output = "0";

		assertIO(input, output);
	}
	@Test
	public void test3() throws Exception {
		String input = "1111111111";
		String output = "642";

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
