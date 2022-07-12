public class CardLost extends Lost{
    private String name;
    private String id;
    private String college;
    public CardLost(String lostItem, String lostPlace, int year, int month, int day, String colSite, String name, String id, String college)
    {
        super(lostItem, lostPlace, year, month, day, colSite);
        this.name = name;
        this.id = id;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "CardLost{" +"lostPlace='" + super.getLostPlace() + '\'' +
                ", lostTime=" + super.getLostTime() +
                ", lostItem='" + super.getLostItem() + '\'' +
                ", colSite='" + super.getColSite() + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
