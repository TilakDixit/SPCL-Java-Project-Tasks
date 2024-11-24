package com.example.spclProject.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class uploadcode {
    public final String upload_dir = "C:\\Users\\tilak\\OneDrive\\Desktop\\maven\\spclProject\\src\\main\\resources\\static\\image";
    
    public boolean uploadFile(MultipartFile file) {
        boolean f = false;
        try {
            Files.copy(file.getInputStream(), Paths.get(upload_dir + "\\" + file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            f = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f;
    }

    public String getFile(String filename) {
        try {
            File file = new File(upload_dir + "\\" + filename);
            if (file.exists()) {
                // Construct the URL for the file
                return "http://localhost:8080/static/" + filename;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
