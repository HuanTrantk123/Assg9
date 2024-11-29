/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookjp;

import java.util.Scanner;

/**
 *
 * @author huan
 */
public abstract class Book implements iBook {

    private String id;
    private String title;
    double basePrice;

    Scanner scanner = new Scanner(System.in);

    public void enterDetail() {
        System.out.println("Nhap id:");
        id = scanner.nextLine();
        System.out.println("Nhap title:");
        title = scanner.nextLine();
        System.out.println("Nhap basePrice");
        basePrice = scanner.nextDouble();
    }

    @Override
    public double calculatePrice() {

        return basePrice;

    }

    @Override
    public void displaydetail() {
        System.out.println("id:" + id + ",title:" + title + ",price:" + basePrice);
    }

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

}
