public class cartaInglesa{
	
	private int numVal;
	private String palo, color;

	public cartaInglesa(int numVal, String palo, String color){
		setNumVal(numVal);
		setPalo(palo);
		setColor(color);
	}

	public int getNumVal(){
		return numVal;
	}

	public void setNumVal(int numVal){
		this.numVal = numVal;
	}

	public String getPalo(){
		return palo;
	}

	public void setPalo(String palo){
		this.palo = palo;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String toString(){
		return "\"" + numVal + " " + color + " de " + palo + "\"";
	}

}