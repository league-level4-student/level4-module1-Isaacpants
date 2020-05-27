package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void horoscopes(Zodiac z) {
		switch(z) {
		case ARIES:
			System.out.println("A");
			break;
		case  TAURUS:
			System.out.println("T");
			break;
		case GEMINI:
			System.out.println("G");
			break;
		case CANCER:
			System.out.println("C");
			break;
		case LEO:
			System.out.println("L");
			break;
		case VIRGO:
			System.out.println("V");
			break;
		case LIBRA:
			System.out.println("L");
			break;
		case SCORPIO:
			System.out.println("S");
			break;
		case SAGITTARIUS:
			System.out.println("Sa");
			break;
		case CAPRICORN:
			System.out.println("C");
			break;
		case  AQUARIUS:
			System.out.println("Aq");
			break;
		case PISCES:
			System.out.println("P");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Random r = new Random();
		
		Zodiac[] options = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO,
				Zodiac.VIRGO,Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES };
		int rand = r.nextInt(options.length);
		horoscopes(options[rand]);
	}
}
