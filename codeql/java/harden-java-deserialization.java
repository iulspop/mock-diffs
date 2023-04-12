package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationManager {

    public UserDetails deserializeFromFile(String filePath) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            UserDetails userDetails = (UserDetails) ois.readObject();
            return userDetails;
        }
    }
}
