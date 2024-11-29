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
public class Processor {

    public static void main(String[] args) {
        BookList booklist = new BookList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add new textbook \n"
                + "2. Add new reference book \n"
                + "3. Update book by id \n"
                + "4. Delete book by id \n"
                + "5. Find book by id \n"
                + "6. Display all books \n"
                + "7. Find the most expensive book \n"
                + "8. Count the total number of TextBooks and ReferenceBooks separately in the \n"
                + "book list. ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                TextBook tb = new TextBook();
                booklist.Addbook(tb);
                
            case 2:
                Book book2 = new ReferenceBook();
                booklist.Addbook(book2);
            case 3:
                String IdtoUpdate;
                IdtoUpdate = scanner.nextLine();
                booklist.UpdateBookByID(IdtoUpdate);
            case 4:
                String idtoDelete;
                idtoDelete = scanner.nextLine();
                booklist.deleteByID(idtoDelete);
            case 5:
                String idtoFind = scanner.nextLine();
                booklist.findBookById(idtoFind);
            case 6:
                booklist.displayAllBook();
            case 7:
                booklist.ExpensiveBook();
            case 8:
                booklist.countBooks();
        }

    }
}
