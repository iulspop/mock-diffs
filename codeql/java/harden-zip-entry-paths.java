package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipManager {

    public void unzip(InputStream is, String unzipTargetDirectory) throws IOException {
        ZipInputStream zip = new ZipInputStream(is);
        ZipEntry zipEntry = zip.getNextEntry();
        while (zipEntry != null) {
            File file = new File(unzipTargetDirectory, zipEntry.getName());
            if (!zipEntry.isDirectory()) {
                FileOutputStream fos = new FileOutputStream(file);
                IOUtils.copy(zip, fos);
                fos.close();
            }
            zipEntry = zip.getNextEntry();
        }
        zip.closeEntry();
        zip.close();
    }
}
