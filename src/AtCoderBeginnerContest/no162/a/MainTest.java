package AtCoderBeginnerContest.no162.a;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {

	@ParameterizedTest
	@MethodSource("params")
	public void test(String input ,String output) throws Exception {

		assertIO(input, output);
	}


	static Stream<Arguments> params() {
	    return Stream.of(
	        Arguments.arguments("117", "Yes"),
	        Arguments.arguments("123", "No"),
	        Arguments.arguments("777", "Yes")
	    );
	}

	private void assertIO(String input, String output) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Main.main(new String[0]);

		assertEquals(output + System.lineSeparator(), out.toString());
//		assertEquals(output, out.toString());
	}
}
