package files_problem;

import java.util.Objects;

public class FileFactory {
    File file;

    public File createFile(String type){
        if(Objects.equals(type, "PDF"))
            return file=new WordFile();
        if (Objects.equals(type, "Word"))
            return file =new PDFFile();
        return null;
    }
}
