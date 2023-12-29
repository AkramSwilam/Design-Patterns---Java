package download_problem;

public class RealDownload implements Download{
    String targetFile;
    RealDownload(String targetFile){
        this.targetFile=targetFile;
        downloadFromInternet();
    }
    @Override
    public void download() {
        System.out.println("downloaded");
    }
    private void downloadFromInternet(){
        System.out.println("downloading from internet ...");
    }
}
