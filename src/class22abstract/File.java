package class22abstract;

public abstract class File {
    private String nameOfFile;
    private int sizeOfFile;



    File (String nameOfFile, int sizeOfFile){
        this.nameOfFile=nameOfFile;
        this.sizeOfFile=sizeOfFile;

    }
    void printInfo(){
        System.out.println(("File name: "+nameOfFile+" File size: "+sizeOfFile));
    }
    void edit(){
        System.out.println("Editing file....");
    }
   abstract void open();
    void close(){
        System.out.println("File closing....");
    }
}
class JavaFile extends File{

    JavaFile(String nameOfFile, int sizeOfFile) {
        super(nameOfFile, sizeOfFile);
    }

    @Override
    void edit() {
        System.out.println("Editing in intelliJ....");
    }

    @Override
    void open() {
        System.out.println("intelliJ opening....");

    }
}
class WordFile extends File{
    WordFile(String nameOfFile, int sizeOfFile) {
        super(nameOfFile, sizeOfFile);
    }

    @Override
    void edit() {
        System.out.println("Editing in Microsoft Word....");
    }

    @Override
    void open() {
        System.out.println("Microsoft word opening.....");

    }
}
class PdfFile extends File{
    PdfFile(String nameOfFile, int sizeOfFile) {
        super(nameOfFile, sizeOfFile);
    }

    @Override
    void edit() {
        System.out.println("Editing in doc file....");
    }

    @Override
    void open() {
        System.out.println("Doc file opening..... ");
    }
}