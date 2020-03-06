import abstractFactory.CardFactory;
import abstractFactory.FactoryVisa;
import cards.Card;
import Factory.Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card myMaster=Factory.getCard(123456, "Almicar Aponte", 456, "MasterCard");
		System.out.println(myMaster);
		
		Card mySecondCard = CardFactory.getCard (new FactoryVisa (123456, "Amilcar", 456));
		System.out.println(mySecondCard);
		
		
	}

}
