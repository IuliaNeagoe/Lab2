package example.interfaces;

import example.exceptions.buyException;
import example.exceptions.readException;

/**
 * Created by IuliS on 27.10.2014.
 */
/*
 * This is an interface for Singers
*/

public interface IBuy
{
    /**
     * This is the singing method
     */
    public void buyBook() throws buyException;
    public void read() throws readException;
}
