import java.util.ArrayList;

public class Client extends StackeHolder{
    protected double height;
    protected double weight;
    protected int age;
    protected Card card;
    protected ArrayList<Sport> sports = new ArrayList<Sport>();

    public Client(String f,String l,String g,String ph ,double h,double w,int a){
        super(f,l,g,ph);
        this.height=h;
        this.weight=w;
        this.age=a;
    }
}
