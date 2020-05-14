package AtCoderBeginnerContest.no148.a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "3\r\n" + "1";
		String output = "2";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "1\r\n" + "2";
		String output = "3";
		assertIO(input, output);
	}

//	@Test
//	public void test3() throws Exception {
//		String input = "8 5 22\r\n" + "100 3 7 5 3 1\r\n" + "164 4 5 2 7 8\r\n" + "334 7 2 7 2 9\r\n"
//				+ "234 4 7 2 8 2\r\n" + "541 5 4 3 3 6\r\n" + "235 4 8 6 9 7\r\n" + "394 3 6 1 6 2\r\n"
//				+ "872 8 4 3 7 2";
//		String output = "1067";
//		assertIO(input, output);
//	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output + System.lineSeparator(), out.toString());
	}
}
