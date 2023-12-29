package files_problem;

public class PDFFile extends File{
    @Override
   public void open(String text) {
        System.out.println("opened form PDF");
        System.out.println(text);
    }

    @Override
   public void delete() {
        System.out.println("deleted from PDF");
    }
}
