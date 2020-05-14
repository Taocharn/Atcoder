package AtCoderBeginnerContest.no148.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2\r\n" + "ip cc";
		String output = "icpc";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "8\r\n" + "hmhmnknk uuuuuuuu";
		String output = "humuhumunukunuku";
		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "5\r\n" + "aaaaa aaaaa";
		String output = "aaaaaaaaaa";
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
