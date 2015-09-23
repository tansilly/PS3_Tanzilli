/**
 * 
 * @author Tim
 *
 */  
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class accountTest {

		Account a;
		
		// creating an account with $20000 in it 
		@Before
		public void setUp() throws Exception {
			a = new Account(1122 , 20000.00);
			a.setAnnualInterestRate(4.5);
		}

		@After
		public void tearDown() throws Exception {
			a = null;
		}
		
		//testing withdrawal 
		@Test(expected=InsufficientFundsException.class)
		public final void testWithdraw() throws InsufficientFundsException {
				 assertEquals("$20000 Expected, actual is $17500",(long)a.getBalance(),(long)20000.00);
				 a.withdraw(25000);
		}

		// testing deposit
		@Test
		public final void testDeposit() {
				a.deposit(3000);
		}


		//testing balance
		@Test
		public final void testBalance(){
			a.getBalance();
		}
		
		//testing monthly interest rate
		@Test
		public final void testMonthlyInterestRate(){
			a.getMonthlyInterestRate();
		}
		
		//testing get date
		@Test
		public final void testDateCreated(){
			a.getDateCreated();
		}
}