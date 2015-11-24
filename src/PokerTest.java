import static org.junit.Assert.*;

import org.junit.Test;

public class PokerTest {

	@Test
	public void IsFourOfAKindWithOnes() {
		
		Hand hand = new Hand("1♦ 1♥ 1♠ 1♣ 10♥");
		assertEquals("Four Of A Kind", hand.type());
	}
	
	@Test
	public void IsFourOfAKindWithFives() {
		
		Hand hand = new Hand("5♦ 5♥ 5♠ 5♣ 10♥");
		assertEquals("Four Of A Kind", hand.type());
	}
	
	@Test
	public void IsFourOfAKindWithTwos() {
		
		Hand hand = new Hand("2♦ 2♥ 2♠ 2♣ 10♥");
		assertEquals("Four Of A Kind", hand.type());
	}

	@Test
	public void IsThreeOfAKindWithOnlyNumbers() {
		
		Hand hand = new Hand("4♦ 4♥ 4♠ 6♣ 10♥");
		assertEquals("Three Of A Kind", hand.type());
	}
}
