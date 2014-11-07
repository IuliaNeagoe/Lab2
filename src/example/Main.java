package example;

import example.Books.Book;
import example.Books.DramaBook;
import example.Books.RomanceBook;
import example.Books.ScienceBook;
import example.exceptions.buyException;
import example.exceptions.readException;
import example.interfaces.IBuy;

/**
 * Created by IuliS on 26.10.2014.
 */
public class Main {

    public static void main(String[] args) throws buyException, readException {
        IBuy book = new DramaBook("Dragoste tarzie");
        Book science = new ScienceBook("Avatarul");
        DramaBook dramaB = new DramaBook("Suspinul","drama");
        ScienceBook scienceB = new ScienceBook("Meteoritul verde","Ciudatenii");
        RomanceBook romanceB = new RomanceBook("Ea","romance","Reid Stein");
        try {
            book.buyBook();
        } catch (buyException e) {
            e.printStackTrace();
        }
        try {
            ((IBuy)science).buyBook();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        try {
            book.read();
        } catch (readException e) {
            e.printStackTrace();
        }
       try {
           if(romanceB.popularAuthor(romanceB.getAuthor()))
           {
               System.out.println("The author of the "+ romanceB.getTitle() + "book is popular!" );
               romanceB.read();
           }
           else
               System.out.println("The author of the "+ romanceB.getTitle() + "book is not popular!" );
       }
       catch (readException e) {
           e.printStackTrace();
       }
        dramaB.setmNr_volumes(120);
        dramaB.setType("drama");
        dramaB.setPublishing("Corint");

        System.out.println("The author of the  book" +romanceB.getTitle() + "is : " +romanceB.getAuthor());

        science.setmNr_pages(1165);




    }
}
;
