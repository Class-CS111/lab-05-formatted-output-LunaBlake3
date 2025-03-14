// COLLABORATORS: Blake Luna-Beltran
// CS111
// 02/13/2025


// DESCRIPTION: To convert $ amounts into the various coins.

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double dollar1AMOUNT = 8.42;
    int centsLEFTOVER = 0;
    int coinPENNY = 0;
    int coinNICKEL = 0;
    int coinDIME = 0;
    int coinQUARTER = 0;


    //CALCULATION SECTION
    centsLEFTOVER = (int) (100 * dollar1AMOUNT);
    coinQUARTER = centsLEFTOVER / 25;
    centsLEFTOVER %= 25;
    coinDIME = centsLEFTOVER / 10;
    centsLEFTOVER %= 10;
    coinNICKEL = centsLEFTOVER /5;
    centsLEFTOVER %= 5;
    coinPENNY = centsLEFTOVER;


    //OUTPUT SECTION

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, %d pennies. ",
     dollar1AMOUNT, coinQUARTER, coinDIME, coinNICKEL, coinPENNY);


  }

}
