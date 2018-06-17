package learning.quiz;

import java.io.File;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class UnzipEncyptedFile {

    public static void main(String[] args) {

        final FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("N/A", "zip");
        //Folder where zip file is present
        final File file = new File("C:\\Users\\mabhardwaj\\Desktop\\doc\\ZipFile");
        for (final File child : file.listFiles()) {
            try {
                ZipFile zipFile = new ZipFile(child);
                if (extensionFilter.accept(child)) {
                    if (zipFile.isEncrypted()) {
                        //Your ZIP password
                        zipFile.setPassword("MYPASS!");
                    }
                    List fileHeaderList = zipFile.getFileHeaders();

                    for (int i = 0; i < fileHeaderList.size(); i++) {
                        FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
                        //Path where you want to Extract
                        zipFile.extractFile(fileHeader, "C:/Users/Desktop/ZipFile");
                        System.out.println("Extracted");
                    }
                }
            } catch (Exception e) {
                System.out.println("Please Try Again");
            }
        }

    }
}