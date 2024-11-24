package com.example.spclProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.spclProject.helper.uploadcode;

@RestController
public class filecontroller {

    @Autowired
    private uploadcode uploadcode;

    @PostMapping("/upload-file")
    public ResponseEntity<String> UploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must contain file");
        }

        String contentType = file.getContentType();
        if (contentType != null && (contentType.equals("application/pdf") || 
                                    contentType.equals("image/jpeg") || 
                                    contentType.equals("image/png") || 
                                    contentType.equals("image/gif") || 
                                    contentType.equals("image/bmp") || 
                                    contentType.equals("image/webp"))) {
            boolean f = uploadcode.uploadFile(file);

            if (f) {
                return ResponseEntity.ok("File is uploaded successfully");
            }
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong, try again");
    }

    @GetMapping("/retrieve-file")
    public ResponseEntity<String> retrieveFile(@RequestParam("filename") String filename) {
        String fileUrl = uploadcode.getFile(filename);

        if (fileUrl != null) {
            return ResponseEntity.ok(fileUrl);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File not found");
        }
    }
}

