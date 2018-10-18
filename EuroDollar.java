

// Dies wird nur die Scanner-Klasse importieren // This will import just the Scanner class
import java.util.Scanner;

//Bestimmen einer Klasse // Determine a class
public class EuroDollar {

// Hauptmethode // main method
	public static void main(String[] args) {

// nachpr�fende Schleife // checking loop
		do {

// Eine Eingabe wird an das System gegeben //An input is given to the system
			Scanner eingabe = new Scanner(System.in);

//Text ausgeben //Output text
			System.out.println(
					"Bitte geben Sie die Zahl ein, welche W�hrungstausch Sie durchf�hren wollen.\n1:Euro zu Dollar\n2:Dollar zu Euro");

//  ein Datentyp f�r Flie�kommazahlen // a data type for floating-point numbers
			double einheit = eingabe.nextDouble();

// Darstellung von ganzen Zahlen bis 32 Bit // Representation of integers up to 32 bits
			int w�hrung = (int) einheit;

// Falls die Bedingung zutrifft , (nur dann) erfolgt die Anweisung // If the condition is true, then (only then) is the instruction
			if ((w�hrung != 1) && (w�hrung != 2)) {
				System.out.println("Unzul�ssige Eingabe!");
			} else {
				Scanner wert = new Scanner(System.in);
				System.out.println("Nun geben Sie bitte an wieviel Sie umtauschen wollen:");

//  ein Datentyp f�r Flie�kommazahlen // a data type for floating-point numbers
				double geld = wert.nextDouble();

// Wert wird �berpr�ft und entsprechende Anweisungen werden ausgef�hrt // Value is checked and appropriate instructions are executed
				switch (w�hrung) {
				case 1:
					System.out.println(geld + " Euro sind " + geld * 1.36 + " Dollar.");
					break;
				case 2:
					System.out.println(geld + " Dollar sind " + geld * 0.86 + " Euro.");
					break;
				}
			}

// Abfrage f�r eine neue Rechnung oder zu beenden // Query for a new bill or exit
			Scanner ende = new Scanner(System.in);

// Text ausgabe bzw. Abfrage // query
			System.out.println("M�chten Sie das Programm beenden? Y-Ja/N-Nein");

// Char bezieht sich auf ''Y'', falls auftritt, so beendet man die Schleife // Char refers to '' Y '', if it does, it ends the loop
			char endlauf;
			endlauf = ende.next().charAt(0);
			if (endlauf == 'Y') {
				break;
			}
		} while (true);
	}

}
