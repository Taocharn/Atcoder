package AtCoderBeginnerContest.no168.c;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3 4 9 0";
		String output = "5.00000000000000000000";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "3 4 10 40";
		String output = "4.56425719433005567605";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "3 4 0 0";
		String output = "1";

		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "3 4 6 0";
		String output = "7";

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
