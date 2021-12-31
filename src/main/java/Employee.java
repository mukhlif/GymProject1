
public class Employee extends StackeHolder {
    protected String userName;
    protected String passWord;
    public Employee(String un, String pw, String f,String l,String g,String ph) {
        super(f,l,g,ph);
        this.userName=un;
        this.passWord=pw;
    }
}
