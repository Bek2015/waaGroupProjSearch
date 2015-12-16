/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Bereket
 */
public class car {
private String make;
private String model;
private String year;
private long milage;
private double price;
private int quantiy;

    public car(String make, String model, String year, long milage, double price, int quantiy) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milage = milage;
        this.price = price;
        this.quantiy = quantiy;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getMilage() {
        return milage;
    }

    public void setMilage(long milage) {
        this.milage = milage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }


    




    
}
