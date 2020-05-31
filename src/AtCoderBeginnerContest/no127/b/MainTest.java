package AtCoderBeginnerContest.no127.b;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	public void test1() throws Exception {
		String input = "2 10 20";
		String output = "30\r\n" + "50\r\n" + "90\r\n" + "170\r\n" + "330\r\n" + "650\r\n" + "1290\r\n" + "2570\r\n"
				+ "5130\r\n" + "10250";
		assertIO(input, output);
	}

	@Test
	public void test2() throws Exception {
		String input = "4 40 60";
		String output = "200\r\n" + "760\r\n" + "3000\r\n" + "11960\r\n" + "47800\r\n" + "191160\r\n" + "764600\r\n"
				+ "3058360\r\n" + "12233400\r\n" + "48933560";
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
