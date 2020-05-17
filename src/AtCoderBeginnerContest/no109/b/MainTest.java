package AtCoderBeginnerContest.no109.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "4\r\n" + "hoge\r\n" + "english\r\n" + "hoge\r\n" + "enigma";
		String output = "No";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "9\r\n" + "basic\r\n" + "c\r\n" + "cpp\r\n" + "php\r\n" + "python\r\n" + "nadesico\r\n"
				+ "ocaml\r\n" + "lua\r\n" + "assembly";
		String output = "Yes";

		assertIO(input, output);
	}

	@Test
	public void test3() throws Exception {
		String input = "8\r\n" + "a\r\n" + "aa\r\n" + "aaa\r\n" + "aaaa\r\n" + "aaaaa\r\n" + "aaaaaa\r\n" + "aaa\r\n"
				+ "aaaaaaa";
		String output = "No";

		assertIO(input, output);
	}

	@Test
	public void test4() throws Exception {
		String input = "3\r\n" + "abc\r\n" + "arc\r\n" + "agc";
		String output = "No";

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
