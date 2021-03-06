package example.Books;

import example.exceptions.buyException;
import example.exceptions.readException;
import example.interfaces.IBuy;

/**
 * Created by IuliS on 01.11.2014.
 */
public class RomanceBook extends Book implements IBuy{
    /**
     * Simple Contructor : initializes only with the title of the book, and the other values are default
     * @param title
     */

    private boolean mHasMovie;

    public  RomanceBook(String title){

        super(title);
        setmNr_pages(0);
        setPublishing("");
        setTitle("");
        setType("Romance");
    }

    /**
     * Another constructor: initializes with title, type and author
     * @param title
     * @param type
     * @param author
     */
    public  RomanceBook(String title,String type, String author){

        //super(title + " "+type + " "+author);
        super(title);
        setmNr_pages(0);
        setPublishing("");
        setTitle("");
        setType(type);
    }


    /**
     * The author of the book
     */
    String mAuthor;
    /**
     * Verifies if the author is popular(starts with Reid)
     * @param bookAuthor
     * @return
     */
    public boolean popularAuthor(String bookAuthor)
    {
        if(bookAuthor != null && bookAuthor.startsWith("Reid"))
            return true;
        return false;
    }

    /**
     * gets the name of the author
     * @return
     */
    public String getAuthor()
    {
        return this.mAuthor;
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

    public boolean getmHasMovie(){return this.mHasMovie;}
    public void setmHasMovie(boolean has){this.mHasMovie=has;}
}
