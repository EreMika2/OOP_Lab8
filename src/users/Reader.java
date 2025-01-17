package users;

import books.Book;
import books.LibraryCard;

import java.util.ArrayList;

public class Reader extends User{

    private String number;
    private String name;
    private LibraryCard card;
    private ArrayList<Book> booksOnHand;

    public Reader(String login, String password) {
        super(login, password);
    }

//    TODO: +rentBook(Book): void

//    TODO: +returnBook(Book): void

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }

    public ArrayList<Book> getBooksOnHand() {
        return booksOnHand;
    }

    public void setBooksOnHand(ArrayList<Book> booksOnHand) {
        this.booksOnHand = booksOnHand;
    }
}
