/** @author Aditya Mishra
 *  @version 2.0
 *  @since 2022
 **/

/**
 *  @author adityamishra
 * 
 * Class for Library Book
 */

public class Book {

    /**
     *  @value 10 default value
     */

    static int val = 10;

    /**
     * 
     * @param s Book Name
     */

    public Book(String s) {
    }

    /**
     * Issue a Book to a Statement
     * @param roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */

    public void issue(int roll) throws Exception {
    }

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available return true else false
     */
    
    public boolean available(String str) {
        return true;
    }

    /**
     * Get book name
     * @param id book id
     * @return returns book name
     */
    
    public String getName(int id) {
        return "";
    }
}
