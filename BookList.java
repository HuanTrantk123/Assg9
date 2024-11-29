/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookjp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huan
 */
public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    
    public void Addbook(Book book) {
        bookList.add(book);
    }

    public boolean UpdateBookByID(String Id) {
        System.out.println("Nhap id:");
        Id = scanner.nextLine();

        for (Book book : bookList) {

            if (book.getId().equals(Id)) {

                // Cập nhật thuộc tính chung
                System.out.print("Enter new title: ");
                book.setTitle(scanner.nextLine());
                System.out.print("Enter new base price: ");
                book.setBasePrice(scanner.nextDouble());
                scanner.nextLine(); // Consume newline

                if (book instanceof TextBook) {
                    System.out.print("Enter new subject: ");
                    ((TextBook) book).setSubject(scanner.nextLine());
                } else if (book instanceof ReferenceBook) {
                    System.out.print("Enter new publisher: ");
                    ((ReferenceBook) book).setPublisher(scanner.nextLine());
                }
                return true;
            }
        }
        return false;

    }

    public boolean deleteByID(String id) {
        id = scanner.nextLine();
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }

        }

        return null;

    }

    public void displayAllBook() {
        for (Book book : bookList) {
            book.displaydetail();
        }
    }

    public Book ExpensiveBook() {
        double maxPrice = 0.0;
        Book expensiveBook = null;

        for (Book book : bookList) {
            if (book.calculatePrice() > maxPrice) {
                maxPrice = book.calculatePrice();
                expensiveBook = book;
            }
        }

        return expensiveBook; // Trả về sách có giá cao nhất
    }

    public void countBooks() {
        int countText = 0, countRefe = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                countText++;
            } else if (book instanceof ReferenceBook) {
                countRefe++;
            }

        }
        System.out.println("So luong textbook:" + countText);
        System.out.println("So luong referencebook:" + countRefe);
    }
}
