package TCStoktofive;

/* Write a program that continuously takes user input for the following details:

1. Income (amount earned).

2. Type of Material (category of expenditure).

3. Expenditure on that Material (amount spent).

The input process continues until the user enters "done".

After the input process is complete, the program should:

Display the total income.

Calculate and display the total savings (i.e., Income - Total Expenditure).

List all expenditures (showing where the money was spent and how much).

Income: 5000

Type of Material: Food

Expenditure: 100

Type of Material: Mobile

Expenditure: 200

Type of Material: Electricity

Expenditure: 500

Then the user enters "done".

Total Income: 5000

Total Savings: 4200

Expenditures:

Food: 100

Mobile: 200

Electricity: 500

Input

Expected output */

import java.util.*;
public class Expendure {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        // Take income input
        System.out.print("Enter Income: ");
        int income = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        HashMap<String, Integer> expenditures = new HashMap<>();
        int totalExpenditure = 0;
        
        // Take expense details
        while (true) {
            System.out.print("Enter Type of Material (or 'done' to finish): ");
            String material = sc.nextLine();
            if (material.equalsIgnoreCase("done")) {
                break;
            }
            
            System.out.print("Enter Expenditure on " + material + ": ");
            int expense = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            expenditures.put(material, expenditures.getOrDefault(material, 0) + expense);
            totalExpenditure += expense;
        }
 int totalSavings = income - totalExpenditure;
        
        // Display results
        System.out.println("\nTotal Income: " + income);
        System.out.println("Total Savings: " + totalSavings);
        System.out.println("\nExpenditures:");
        
        for (Map.Entry<String, Integer> entry : expenditures.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
  }
