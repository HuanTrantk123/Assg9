/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookjp;

/**
 *
 * @author huan
 */
public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    @Override
    public void displaydetail() {
        super.displaydetail();
        System.out.println("Publisher:" + publisher);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * 1.2;

    }

    @Override
    public void enterDetail() {
        super.enterDetail();
        System.out.println("Nhap Publisher:");
        publisher = scanner.nextLine();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
