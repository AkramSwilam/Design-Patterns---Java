package download_problem;

public class ProxyDownload implements Download{

    RealDownload realDownload;
    String targetFile;
    public ProxyDownload(String targetFile){
        this.targetFile=targetFile;
    }
    @Override
    public void download() {
        if(realDownload==null)
            realDownload=new RealDownload(targetFile);
        realDownload.download();
    }
}
