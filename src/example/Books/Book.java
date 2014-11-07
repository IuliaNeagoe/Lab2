package example.Books;

/**
 * Created by IuliS on 27.10.2014.
 */

/**
 * This is the abstract class
 */
public abstract class Book {
    /*The name of the book*/
    private String mTitle;
    private String mPublishing;
    private String mType;
    private int mNr_pages;
    /**
     * The default constructor that initializes the book with the given name
     * @param title
     */
    public Book(String title)
    {
        this.mTitle=title;
    }
    /**
     * This method must be overwritte  by all subclasses
     * @param
     * @return <code>True<code/> if the book is borrowed
     */
    public abstract boolean borrowBook(String bookname);

    /**
     * Sets the name of the student
     * @param title The title of the book
     */
    public void setTitle(String title)
    {
        this.mTitle=title;
    }

    /**
     *
     * @return title of the books
     */
    public String getTitle()
    {
        return this.mTitle;
    }
    public String getPublishing(){return  this.mPublishing;}
    public void setPublishing(String pub){this.mPublishing=pub;}
    public String getType(){return this.mType;}
    public void setType(String type){this.mType=type;}
    public int getNr_pages(){return this.mNr_pages;}
    public void setmNr_pages(int nr){this.mNr_pages=nr;}
}
