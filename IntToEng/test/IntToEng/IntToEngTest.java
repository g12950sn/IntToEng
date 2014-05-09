package IntToEng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import IntToEng.src.IntToEng;

public class IntToEngTest {

	@Test
	public void �ꌅ�̐����̕\��() {
		IntToEng To = new IntToEng();
		String expected = "5 five";
		String actual = To.translateEng(5);
		assertThat(actual,is(expected));
	}

	@Test
	public void �񌅂̐����̕\��() {
		IntToEng To = new IntToEng();
		String expected = "33 thirty three";
		String actual = To.translateEng(33);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void �O���̐����̕\��() {
		IntToEng To = new IntToEng();
		String expected = "666 six hundred sixty six";
		String actual = To.translateEng(666);
		assertThat(actual,is(expected));
	}
}
