import java.util.Scanner;

public class Blackjack{
	public static void main(String[] args) {

		int valorMano, menuVal, sizeMano;
		Scanner in = new Scanner(System.in);

		System.out.println("Bienvenido a Blackjack!");

		//Crear mazo de cartas
		barajaInglesa miBaraja = new barajaInglesa();
		//Revolver mazo de cartas
		miBaraja.revolverMazo();

		//Repartir cartas iniciales a jugador y a dealer

		cartaInglesa manoDeJugador[] = new cartaInglesa[20];
		cartaInglesa manoDeDealer[] = new cartaInglesa[5];

		manoDeJugador[0] = miBaraja.repartirCarta();
		manoDeDealer[0] = miBaraja.repartirCarta();
		manoDeJugador[1] = miBaraja.repartirCarta();
		manoDeDealer[1] = miBaraja.repartirCarta();

		sizeMano = 2;

		do{
			System.out.println("Tu mano actual es:");
			//Cambiar por un print array de mano
			printArray(manoDeJugador);
			valorMano = calcularSuma(manoDeJugador);
			System.out.println("\n¿Quieres robar otra carta? Suma total es: " + valorMano);
			System.out.println("1 - Si\n2 - No");
			menuVal = in.nextInt();
			switch(menuVal){
				case 1:
				sizeMano++;
				manoDeJugador[sizeMano-1] = miBaraja.repartirCarta();
				break;
				case 2: 
				menuVal = 3;
				break;
				case 3:
				menuVal = 0;
				System.out.println("Por favor selecciona un número entre 1 y 2.");
				default:
				System.out.println("Por favor selecciona un número entre 1 y 2.");
				break;
			}
		}while(menuVal != 3);

		valorMano = calcularSuma(manoDeJugador);

		System.out.println("El valor total de tu mano es de: " + valorMano);

	}

	public static int calcularSuma(cartaInglesa[] manoArray){
		int result = 0;
		for(int i = 0; i<manoArray.length; i++){
			try{
				result = result + manoArray[i].getNumVal();
			}catch(Exception e){}
		}
		return result;
	}

	public static void printArray(cartaInglesa[] arrayPrint){
		for(int i = 0; i<arrayPrint.length; i++){
			try{
				System.out.print(arrayPrint[i].toString() + ", ");
			}
			catch(Exception e){}
		}
	}

}