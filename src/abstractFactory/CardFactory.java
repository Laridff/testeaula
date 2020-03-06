package abstractFactory;

import cards.Card;

public class CardFactory {

	public static Card getCard(abstractfactory factory) {
		return factory.createCard();
	}
}
