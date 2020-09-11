import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        //Set taxes
       final float TAX_BRACKET_LOW = 6.0f;
       final float TAX_BRACKET_HIGH = 21.0f;

        //Ask for input
        Scanner purchasePriceInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Wat is de inkoopprijs");
        Float purchasePrice = purchasePriceInput.nextFloat();  // Read user input

        Scanner marginOfProfitInput = new Scanner(System.in);
        System.out.println("Wat is de winstmarge? in %");
        Float marginOfProfit = marginOfProfitInput.nextFloat();  // Read user input

        //Calculate total with margin
        Float sellingPriceMarginOfProfit = purchasePrice / 100 * marginOfProfit;

        //Calculate prices with and without taxes
        Float totalNoTax = sellingPriceMarginOfProfit + purchasePrice;
        Float totalWithLowTax = ((totalNoTax / 100) * TAX_BRACKET_LOW) + totalNoTax;
        Float totalWithHighTax = ((totalNoTax / 100) * TAX_BRACKET_HIGH) + totalNoTax;

        //Display amount
        System.out.println("Verkoopprijs exclusief BTW : " + totalNoTax);
        System.out.println("Verkoopprijs inclusief 6% BTW: " + totalWithLowTax);
        System.out.println("Verkoopprijs inclusief 21% BTW: " + totalWithHighTax);

    }
}
