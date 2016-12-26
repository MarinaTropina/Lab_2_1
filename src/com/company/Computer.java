package com.company;

/**
 * Created by user on 12.12.2016.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private double price;
    private int quantityCPU;
    private int frequencyCPU;



    public void view(){
        System.out.println("Все поля объекта - " + manufacturer + ", " + serialNumber + ", " +
                price + ", " + quantityCPU + ", " + frequencyCPU );

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
}
