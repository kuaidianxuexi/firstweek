import java.time.LocalDate;

public class Lost implements Comparable<Lost>{
   private String lostPlace;
   private LocalDate lostTime;
   private String lostItem;
   private String colSite;
   public Lost(String lostItem, String lostPlace, int year, int month, int day, String colSite)
   {
       this.lostItem = lostItem;
       this.lostPlace = lostPlace;
       this.colSite = colSite;
       lostTime = LocalDate.of(year, month, day);
   }

    public String getLostPlace() {
        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace;
    }

    public LocalDate getLostTime() {
        return lostTime;
    }

    public void setLostTime(LocalDate lostTime) {
        this.lostTime = lostTime;
    }

    public String getLostItem() {
        return lostItem;
    }

    public void setLostItem(String lostItem) {
        this.lostItem = lostItem;
    }

    public String getColSite() {
        return colSite;
    }

    public void setColSite(String colSite) {
        this.colSite = colSite;
    }

    @Override
    public int compareTo(Lost that){
        return this.lostTime.compareTo(that.lostTime);
    }

    @Override
    public String toString() {
        return "Lost{" +
                "lostPlace='" + lostPlace + '\'' +
                ", lostTime=" + lostTime +
                ", lostItem='" + lostItem + '\'' +
                ", colSite='" + colSite + '\'' +
                '}';
    }
}
