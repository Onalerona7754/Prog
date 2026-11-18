/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
public class PrintProduct {
    private IProduct product;

    // Constructor accepting the interface type
    public PrintProduct(IProduct product) {
        this.product = product;
    }

    // Method to print total product sales
    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // Method to print average product sales
    public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: (int) " + (int) product.GetAverageProductSold());
    }

    // Method to print the most popular product
    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    // Combined method to print the full report summary block
    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************************************");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
    }
}
