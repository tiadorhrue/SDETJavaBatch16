package class22abstract;

public class FileTester {
    public static void main(String[] args) {
        class22abstract.File[] files={new class22abstract.JavaFile("Java.file-Hello World",80),
                new class22abstract.PdfFile("Pdf.file-Homework",56),
            new class22abstract.WordFile("Word.file-Final Essay",125)

        };

        for(class22abstract.File f : files){
            f.printInfo();
            f.open();
            f.edit();
            f.close();

            System.out.println();


        }
    }
}
