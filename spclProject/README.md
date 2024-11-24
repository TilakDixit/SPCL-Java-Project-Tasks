# File Upload and Storage Service

This project implements a RESTful API for file upload and retrieval. It supports various file types, enforces file size restrictions, and utilizes a helper class for file operations. Uploaded files are stored in a dedicated `static` folder for easy access.

## Features

- Upload files with validation for:
  - Supported file types.
  - Maximum file size.
- Retrieve stored files via their filenames.
- Supports file types:
  - PDF (`application/pdf`)
  - JPEG (`image/jpeg`)
  - PNG (`image/png`)
  - GIF (`image/gif`)
  - BMP (`image/bmp`)
  - WebP (`image/webp`).
- Files are stored in the `static` folder under:
- Utilizes a helper class for efficient file handling.

Technologies Used
Spring Boot: Framework for building the REST API.
MultipartFile: Handles file uploads.
Helper Class: Provides methods for storing and retrieving files.



Helper Class: uploadcode.java
The uploadcode class handles file upload and retrieval operations. It includes:

File Upload: Saves files to the static/image directory using Files.copy().
File Retrieval: Constructs a URL for the file if it exists in the directory.

Setup and Usage!
-Run the application:
mvn spring-boot:run
-Access the API at http://localhost:8080.!
Here are some result photos included in the repository:

![photo2](https://github.com/user-attachments/assets/177fbb76-33f4-47e8-bd10-86f48aecf785)

![photo1](https://github.com/user-attachments/assets/88ea5529-fedc-4e54-b1fc-6b6447e34597)




## File Size Restrictions

- **Maximum File Size**: 5MB
- **Maximum Request Size**: 5MB

These limits are configured in the `application.properties` file:
```properties
spring.servlet.multipart.max-file-size=5MB
spring.servlet.multipart.max-request-size=5MB

