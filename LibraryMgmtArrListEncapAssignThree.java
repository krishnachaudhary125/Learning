import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        setPrice(price);
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        if(price<0){
            System.out.println("Price should be greater than 0.");
            this.price = 0;
        }else{
            this.price = price;
        }
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void displayBook(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("-------------------------------");
    }
}
class Library{
    ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book b){
        books.add(b);
    }
    public void displayAllBook(){
        if(books.isEmpty()){
            System.out.println("There are no books to display.");
        }
        else{
            for(Book b : books){
                b.displayBook();
            }
        }
    }
}
public class LibraryMgmtArrListEncapAssignThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.print("Number of books to be entered : ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            System.out.println("Enter the detail of book "+(i+1)+".");
            System.out.print("Title : ");
            String title = sc.nextLine();
            System.out.print("Author : ");
            String author = sc.nextLine();
            System.out.print("Price : ");
            double price = sc.nextDouble();
            sc.nextLine();

            Book book = new Book(title, author, price);
            library.addBook(book);
        }
        System.out.println("\nAll the books of Library.");
        library.displayAllBook();
    }
}