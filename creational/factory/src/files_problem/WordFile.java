package files_problem;

public class WordFile extends File{
    @Override
    public void open(String text) {
        System.out.println("opened form Word");
        System.out.println(text);
    }

    @Override
    public void delete() {
        System.out.println("deleted from Word");
    }
}
