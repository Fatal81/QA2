import org.junit.jupiter.api.Test;

public class Mortgage {

        @Test
        public void mortgageCalculations() {
            int mortgageAmount = 157200; //The total Sum that i take as Mortgage loan
            int timePeriodInMonths = 240; //Period of time that to loan is taken for
            double mortgagePercent = 2.7 / 100; //The monthly percentage
            int mortgageAmountPerMonth = mortgageAmount / timePeriodInMonths; //Amount to pay monthly without the percentage
            double mortgagePercentagePerMonth = mortgageAmountPerMonth * mortgagePercent; // The percentage paid / month
            double totalMortgagePercentageOverFullPeriod = mortgagePercentagePerMonth * timePeriodInMonths; // percentage paid over the whole period
            double totalAmountToBePaid = mortgageAmount + totalMortgagePercentageOverFullPeriod;

            System.out.println("- The starting sum is: " + mortgageAmount + "\n" + "- The total percentage is: " +
                    totalMortgagePercentageOverFullPeriod + "\n" + "- And the total amount to be paid including the percentage is: "
                    + totalAmountToBePaid);






        }


}
