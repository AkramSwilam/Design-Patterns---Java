package report_system;

public class PDFReport implements Report{
    @Override
    public void printReport() {
        System.out.println("Print a PDF Report");
    }
}
