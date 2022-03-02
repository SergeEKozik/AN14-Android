package skuksovsky.Lab10.Generics.A2;

import java.io.File;

public class Catalog {
    private File[] listOfFiles;
    private File folder;

    public Catalog(String path) {
        this.folder = new File(path);
        this.listOfFiles = folder.listFiles();
    }

    public void showFiles(int countOfFiles) {
        if (countOfFiles < 0 | countOfFiles > listOfFiles.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < countOfFiles; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Folder " + listOfFiles[i].getName());
            }

        }
    }
}
