
import java.util.Scanner;

public class SalaryCalculation {

    public static void main(String[] args) {
        
        float workHours;
        float salaryPerHour;
        float taxPercent;
        float SalaryBeforeTaxes;
        float amountOfTaxes; // hours*salary per hour*tax percent/100
        float salaryAfterTaxes;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the amount of work hours: ");
        workHours = reader.nextFloat();
        System.out.print("Type in the salary per hour: ");
        salaryPerHour = reader.nextFloat();
        System.out.print("Type in the tax percent: ");
        taxPercent = reader.nextFloat();
        
        SalaryBeforeTaxes = workHours * salaryPerHour;
        System.out.println("Salary before taxes: " + SalaryBeforeTaxes);
        
        amountOfTaxes = workHours * salaryPerHour * taxPercent / 100;
        System.out.println("Amount of tax: " + amountOfTaxes);
        
        salaryAfterTaxes = SalaryBeforeTaxes - amountOfTaxes;
        System.out.println("Salary after taxes: " + salaryAfterTaxes);
        
    }
    
}
