public class barajaInglesa{

	cartaInglesa arrayCartas[] = new cartaInglesa[52];
	int num;
	String palo, color;

	public barajaInglesa(){
		for (int i = 0; i<arrayCartas.length; i++){
			if(i < 13){
				num = i + 1;
				color = "negro";
				palo= "espadas";
			}
			else if(i < 26){
				num = i - 12;
				color = "negro";
				palo= "treboles";
			}
			else if(i < 39){
				num = i - 25;
				color = "rojo";
				palo = "diamantes";
			}
			else{
				num = i - 38;
				color = "rojo";
				palo = "corazones";
			}
			arrayCartas[i] = new cartaInglesa(num, palo, color);
		}
	}

	public cartaInglesa repartirCarta(){
		cartaInglesa dealtCard = arrayCartas[0];
		arrayCartas[0] = null;
		cartaInglesa tempArrayCartas[] = new cartaInglesa[arrayCartas.length - 1];

		for(int i = 0; i<tempArrayCartas.length; i++){
			tempArrayCartas[i] = arrayCartas[i+1];
		}
		arrayCartas = tempArrayCartas;
		return dealtCard;
	}

	public void revolverMazo(){
		int random, randomB;
		for(int i=0; i<50; i++){
			random = (int)(Math.random() * arrayCartas.length);
			randomB = (int)(Math.random() * arrayCartas.length);
			cartaInglesa cartaTemp = arrayCartas[random];
			arrayCartas[random] = arrayCartas[randomB];
			arrayCartas[randomB] = cartaTemp;
		}
	}

	public void printArray(){
		for(int i = 0; i<arrayCartas.length; i++){
			System.out.println(arrayCartas[i].toString());
		}
	}


}