public class Sport {
    protected static int id = 0;
    protected int roomNum;
    protected static int numberOfPlaces;
    protected String coachName;
    protected int price;
    protected String name;
    protected String timing;

    protected Sport(){}
    protected Sport(String name,int room,int nplaces,String timing,String coach,int sub){
        this.name=name;
        this.roomNum=room;
        this.numberOfPlaces=nplaces;
        this.timing=timing;
        this.coachName=coach;
        this.price=sub;
        this.id = id++;
    }
    public boolean availablePlaces(){
        System.out.println("Available"+this.numberOfPlaces+"spaces");
        if(this.numberOfPlaces > 0) {
            return true;
        } else {
            return false;
        }
    }
}
