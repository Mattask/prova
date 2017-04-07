import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testSomma() {
		Classe c=new Classe(2,2);
		int risottenuto= c.somma();
		int risatteso= 4;
		assertEquals(risatteso,risottenuto);
	}

}
