import java.util.*;
import java.io.*;

public class library_management {
    static ArrayList<book> bookslist = new ArrayList<book>();
    static ArrayList<book> Available_bookslist = new ArrayList<book>();
    static ArrayList<book> toReturn_bookslist = new ArrayList<book>();

    private helper help = new helper();



    public static void main(String[] args) {

        library_management library = new library_management();
        library.initialize();
        Available_bookslist=bookslist;
        library.enter_library();
    }
    private void initialize(){
        bookslist.add(addbook("head first java","kathy sierra and bert bates","2016"));
        bookslist.add(addbook("ubix","padma reddy","1990"));
        bookslist.add(addbook("anci c","balaguruswamy","1997"));
        bookslist.add(addbook("fafl","guru","2014"));
    }

    private void enter_library() {
        welcome();
        while (true) {
            int option = list();
            System.out.println(option);
            analyze_option(option);
        }
    }

    private void welcome() {
        System.out.println("You are welcome to the library :)");
    }


    private int list() {

        System.out.println("\n\n1. View the list of books. \n" +
                "2. Checkout. \n" +
                "3. Return a book. \n" +
                "4. Exit from library.");
        System.out.print("Please enter your option here - ");
        int opt_num = help.getoption();
        return opt_num;
    }


    private void analyze_option(int option) {
        if (option == 1) {
            printlist(Available_bookslist);
        }
        if (option == 2) {
            checkout();
        }
        if (option == 3) {
            returnbook();
        }
        if (option == 4) {
            System.out.print("Thank You:)");
            System.exit(0);
        }
    }

    private book addbook(String name,String author,String year) {
        book book1 = new book();
        book1.settitle(name);
        book1.setauthor(author);
        book1.setyear(year);
        return book1;
    }

    private void printlist(ArrayList<book> booklist) {
        for (book b : booklist) {
            System.out.println("Title : " + b.gettitle() + "\t||\tAuthor : " + b.getauthor() + "\t||\tYear of Publications : " + b.getyear());
        }
        if (bookslist.isEmpty())
            System.out.println("There are no more books in the library");

    }

    private void returnbook() {
        System.out.println("\n \n Books yet to return\n");
        printlist(toReturn_bookslist);
        String bookname = help.readstring("Enter the Title of the book : ");
        for  (book b : toReturn_bookslist) {
            if(bookname.equals(b.gettitle())){
                Available_bookslist.add(b);
                toReturn_bookslist.remove(b);
                System.out.println("Thank you for returning the book safely :)");
                return;
            }
        }System.out.println("The book "+ bookname + " is not from our library.");
    }

    private void checkout() {
        System.out.println("\n \n Available books are\n");
        printlist(Available_bookslist);
        String bookname = help.readstring("Enter the Title of the book : ");
        for  (book b : Available_bookslist) {
            if(bookname.equals(b.gettitle())){
                toReturn_bookslist.add(b);
                Available_bookslist.remove(b);
                System.out.println("Thank you! Enjoy the book.");
                return;
            }
        }
        System.out.println("The book "+ bookname + " is not available.");
    }

}

