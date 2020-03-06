package abstractFactory;

import cards.Card;

public class FactoryMastercard extends abstractfactory{
	
	private int number;
	private String name;
	private int cvv;
	
	public FactoryMastercard (int number, String name, int cvv) {
		this.number=number;
		this.name= name;
		this.cvv = cvv;
		
	

}

	@Override
	public Card createCard() {
		// TODO Auto-generated method stub
		return null;
	}}
