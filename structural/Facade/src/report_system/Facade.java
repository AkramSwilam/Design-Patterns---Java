package report_system;

public class Facade {
    Report htmlReport;
    Report pdfReport;
    public Facade(){
        htmlReport= new HtmlReport();
        pdfReport= new PDFReport();
    }

    public void generateHtmlReport(){
        htmlReport.printReport();
    }

    public void generatePdfReport(){
        pdfReport.printReport();
    }

}
