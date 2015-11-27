import static org.junit.Assert.*;

import org.junit.Test;

public class PokerTest {

	@Test
	public void IsFourOfAKindWithOnes() {
		
		Hand hand = new Hand("1♣ 1♥ 1♠ 1♦ 10♦");
		assertEquals("Four Of A Kind", hand.type());
	}
	
	@Test
	public void IsFourOfAKindWithFives() {
		
		Hand hand = new Hand("5♣ 5♥ 5♠ 5♦ 10♦");
		assertEquals("Four Of A Kind", hand.type());
	}
	
	@Test
	public void IsThreeOfAKindWithTwos() {
		
		Hand hand = new Hand("2♣ 2♥ 2♠ 4♦ 10♠");
		assertEquals("Three Of A Kind", hand.type());
	}
	
	@Test
	public void IsOnePair() {
		
		Hand hand = new Hand("3♣ 3♥ 5♥ 2♦ 10♠");
		assertEquals("One Pair", hand.type());
	}
	
	@Test
	public void IsFlush() {
		
		Hand hand = new Hand("2♣ 5♣ 8♣ 9♣ 10♣");
		assertEquals("Flush", hand.type());
	}
}
