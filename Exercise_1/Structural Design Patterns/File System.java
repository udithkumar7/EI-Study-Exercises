import java.util.ArrayList;
import java.util.List;

// Component Interface
interface FileSystem {
    void showDetails();
}

// Leaf Class
class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Composite Class
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        items.add(fileSystem);
    }

    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystem item : items) {
            item.showDetails();
        }
    }
}

// Demo Class
public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("Document.docx");
        File file2 = new File("Photo.jpg");

        Folder folder1 = new Folder("My Documents");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Root Folder");
        folder2.add(folder1);

        folder2.showDetails();
    }
}
