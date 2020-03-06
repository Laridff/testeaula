package abstractFactory;

import cards.Card;

public class FactoryMaestro extends abstractfactory{
	
	private int number;
	private String name;
	private int cvv;
	
	public FactoryMaestro (int number, String name, int cvv) {
		this.number=number;
		this.name= name;
		this.cvv = cvv;
		
	

}

	@Override
	public Card createCard() {
		// TODO Auto-generated method stub
		return null;
	}}

