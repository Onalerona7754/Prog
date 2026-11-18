/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Define the product arrays as required by the assignment
        String[] fullProductNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        String[] reportNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // 2D array to store sales data (3 products by 3 months)
        int[][] salesData = new int[3][3];

        // 2. Prompt user for sales data inputs (matching the sample screenshots)
        for (int i = 0; i < fullProductNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + fullProductNames[i] + ": ");
                salesData[i][j] = scanner.nextInt();
            }
        }

        // 3. Instantiate the Product object implementing IProduct
        IProduct productManager = new Product(salesData, fullProductNames, reportNames);

        // 4. Pass the product manager to PrintProduct to generate the final report
        PrintProduct printer = new PrintProduct(productManager);
        printer.printReport();

        scanner.close();
    }
}