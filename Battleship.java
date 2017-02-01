package battleship;

public class Battleship extends Ship {
	
	/**
	 * Sets the length of a Battleship ship to 4. 
	 */
	public Battleship() {
		this.length = 4;
		for (int i = 0; i < length; i++) {
			hit[i] = false;
		}
	}
	
	
	/* (non-Javadoc)
	 * @see battleship.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		return "Battleship";
		
	}
	
	/* (non-Javadoc)
	 * @see battleship.Ship#getLength()
	 */
	@Override
	int getLength() {
		return 4;
	}


}
