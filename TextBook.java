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
public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

   

    public TextBook(String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;

    }

    @Override
    public void displaydetail() {
        super.displaydetail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Subject:" + subject);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * 1.1;

    }

    @Override
    public void enterDetail() {
        super.enterDetail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhap subject:");
        subject = scanner.nextLine();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
