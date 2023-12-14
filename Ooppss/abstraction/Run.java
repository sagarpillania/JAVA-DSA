public class Run {
    public static void main(String[] args) {
        // Bank bk= new Bank(); // can't make because it's an abstract class. thus no obj no access. thus data hiding achieved.
        SBIread sb=new SBIread();
        sb.writeData();
        sb.readData();
    }
}
