package example;

import example.Books.Book;
import example.Books.DramaBook;
import example.Books.ScienceBook;
import example.exceptions.buyException;
import example.interfaces.IBuy;

/**
 * Created by IuliS on 26.10.2014.
 */
public class Main {

    public static void main(String[] args) throws buyException {
        IBuy book = new DramaBook("Dragoste tarzie");
        Book science = new ScienceBook("Avatarul");

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

    }
}
;
