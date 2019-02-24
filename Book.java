/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private boolean borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = false;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void setRefNumber(String reference)
    {
        if(reference.length() >= 3)
        {
            refNumber = reference;
        }
        else
        {
            System.out.println("Reference to short. Reference unchanged");
        }
    
    }
    
    public void borrowBook()
    {
        if(!borrowed)
        {
            borrowed = true;
        }
        else{
            System.out.println("The book is unavailable. Try again later");
        }
    }
    
    public void returnBook()
    {
        borrowed = false;
    }
    
    public boolean borrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println("The author is " + author);
    }
    
    public void printTitle()
    {
        System.out.println("The book title is " + title);
    }
    
    public void printBookDetails()
    {
        String ref;
        String available;
        if(refNumber.length() > 0)
        {
            ref = refNumber;
        }
        else
        {
            ref = "ZZZ";
        }
        
        if(borrowed)
        {
            available = "Borrowed";
        }
        else{
            available = "Available";
        }
        System.out.println("Author: " + author + ", Title: " + title + ", Pages: " + pages + ", RefNumer: " + ref + ", " + available);
    }
}

