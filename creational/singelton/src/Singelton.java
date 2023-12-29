public class Singelton {
    static private Singelton uniqueInstance;
    private Singelton(){}
    static public Singelton getInstance(){
        if(uniqueInstance==null) return new Singelton();
        return  uniqueInstance;
    }
}
