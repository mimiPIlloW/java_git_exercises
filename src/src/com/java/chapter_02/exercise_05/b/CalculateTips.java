package com.java.chapter_02.exercise_05.b;

public class CalculateTips {

    public double calculateGratuity(double subtotal, double gratuityRate) {
        gratuityTotal = subtotal * gratuityRate / 100;
        return gratuityTotal;
    }

    public double calculateTotal(double subtotal, double gratuityTotal) {
        total = subtotal + gratuityTotal;
        return total;
    }

    private double gratuityRate, gratuityTotal, total, subtotal;

    public double getGratuityRate() {
        return gratuityRate;
    }

    public void setGratuityRate(double gratuityRate) {
        this.gratuityRate = gratuityRate;
    }

    public double getGratuityTotal() {
        return gratuityTotal;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


}
