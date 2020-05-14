package CodeFestival2016QualB.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "10 2 3\r\n" + "abccabaabb";
		String output = "Yes\r\n" + "Yes\r\n" + "No\r\n" + "No\r\n" + "Yes\r\n" + "Yes\r\n" + "Yes\r\n" + "No\r\n"
				+ "No\r\n" + "No";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "12 5 2\r\n" +
				"cabbabaacaba";
		String output = "No\r\n" +
				"Yes\r\n" +
				"Yes\r\n" +
				"Yes\r\n" +
				"Yes\r\n" +
				"No\r\n" +
				"Yes\r\n" +
				"Yes\r\n" +
				"No\r\n" +
				"Yes\r\n" +
				"No\r\n" +
				"No";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5 2 2\r\n" +
				"ccccc";
		String output = "No\r\n" +
				"No\r\n" +
				"No\r\n" +
				"No\r\n" +
				"No";
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
