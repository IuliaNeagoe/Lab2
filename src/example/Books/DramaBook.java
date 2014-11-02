package example.Books;

/**
 * Created by IuliS on 27.10.2014.
 */

import example.exceptions.buyException;
import example.exceptions.readException;
import example.interfaces.IBuy;

/**
 * This is a class  for a military student
 */
public class DramaBook extends Book implements IBuy
{
    /**
     * Initializes the book
     * @param title
     */
   public DramaBook(String title){
       super(title);
   }

    /**
     * Another constructor: initializes with title and type of book
     * @param title
     * @param type
     */
    public DramaBook(String title, String type)
    {
        super(title + " " +type );

    }
    /**
     * Method to borrow one book
     * @param bookname
     * @return
     */
    @Override
    public boolean borrowBook(String bookname) {
        if (bookname !=null ) return true;
        return false;
    }

    /**
     * Throw an error if the title of the book is null
     * @throws buyException
     */
    @Override
    public void buyBook() throws buyException {
        if(getTitle()==null)
            throw new buyException("The book does not exist!");
    }

    @Override
    public void read() throws readException {
        if(getTitle()==null)
            throw new readException("The book does not exist!");
    }
}
