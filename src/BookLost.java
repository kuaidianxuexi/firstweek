public class BookLost extends Lost{
   private String bookName;
   public BookLost(String lostItem, String lostPlace, int year, int month, int day, String colSite, String bookName)
   {
       super(lostItem, lostPlace, year, month, day, colSite);
       this.bookName = bookName;
   }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BookLost{" +"lostPlace='" + super.getLostPlace() + '\'' +
                ", lostTime=" + super.getLostTime() +
                ", lostItem='" + super.getLostItem() + '\'' +
                ", colSite='" + super.getColSite() + '\''+
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
