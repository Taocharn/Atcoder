package AtCoderBeginnerContest.no071.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "atcoderregularcontest";
		String output = "b";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "abcdefghijklmnopqrstuvwxyz";
		String output = "None";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "fajsonlslfepbjtsaayxbymeskptcumtwrmkkinjxnnucagfrg";
		String output = "d";
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
