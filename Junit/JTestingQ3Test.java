import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTestingQ3Test {

	@Test
	
	 void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,() -> JTestingQ3.withdraw(800));
        assertEquals(500, JTestingQ3.withdraw(100));
        System.out.println(JTestingQ3.withdraw(100));
}
}
