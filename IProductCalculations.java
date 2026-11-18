/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
interface IProductCalculations {
   public class ProductCalculations implements IProductCalculations {
    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    public double GetVat() {
        return price * 0.15; // 15% VAT calculation
    }

    public double GetCommission() {
        return price * 0.05; // 5% Commission calculation
    }

    public double GetTotal() {
        return price + GetVat() + GetCommission(); // Total = Price + VAT + Commission
    }
} 
}
