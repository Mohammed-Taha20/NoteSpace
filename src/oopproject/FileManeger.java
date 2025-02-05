/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManeger {

    File Datetfile;

    public FileManeger() {

        Datetfile = new File("D:\\Date.txt");
        try {
            user.usersList = JSONDESERIALIZING();

        } catch (Exception e) {
            e.printStackTrace();
            user.usersList = new ArrayList<>(); // Or another appropriate default value
        }
    }

    public boolean isValidUser(String username, String password) {
        // Check credentials against the stored users
        for (int i = 0; i < user.usersList.size(); i++) {
            if (user.usersList.get(i).getUser_name().equals(username)
                    && user.usersList.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public File CreateFolder(user last) {
        try {
            user u = CheckingSign();
            String path = "D:\\File Maneger\\";
            
            path = path + u.user_name;
            File f = new File(path);
            if (!f.exists()) {
                boolean created = f.mkdirs();
                if (created) {
                    System.out.println("File Created");
                } else {
                    System.out.println("File is already Exist");
                }
            }
            return f;
        } catch (Exception e) {
            return null;
        }
    }

    public user CheckingSign() {
        for (int i = 0; i < user.usersList.size(); i++) {
            if (user.usersList.get(i).sign) {
                return user.usersList.get(i);
            }
        }
        return null;
    }

    public File CreateFile(String path, String Name) {
        try {
            user signUser = CheckingSign();
            CreateFolder(signUser);
            int newFileCounter = signUser.getFileCounter() + 1; // Increment the file counter
            signUser.setFileCounter(newFileCounter);
            System.out.println(signUser.fileCounter);
            path = path + signUser.user_name + "\\" + Name + ".txt";
            System.out.println(path);
            File f = new File(path);

            if (f.createNewFile()) {
                System.out.println("File Created0123");
            } else {
                System.out.println("File is already Exist12312");
            }

            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public File CreatePointFile(String path, String Name) {
        
        try {
            user signUser = CheckingSign();
            CreateFolder(signUser);
            int newFileCounter = signUser.getFileCounter() + 1; // Increment the file counter
            signUser.setFileCounter(newFileCounter);
            System.out.println(signUser.fileCounter);
            path = path + signUser.user_name + "\\" + Name + " points" + ".txt";
            System.out.println(path);
            File f = new File(path);

            if (f.createNewFile()) {
                System.out.println("File Created0123");
            } else {
                System.out.println("File is already Exist12312");
            }

            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public File CreateFileImage(String path, String Name) {
        try {
            user signUser = CheckingSign();
            CreateFolder(signUser);
            int newFileCounter = signUser.getFileCounter() + 1; // Increment the file counter
            signUser.setFileCounter(newFileCounter);
            System.out.println(signUser.fileCounter);
            path = path + signUser.user_name + "\\" + Name + ".jpg";
            System.out.println(path);
            File f = new File(path);

            if (f.createNewFile()) {
                System.out.println("File Created0123");
            } else {
                System.out.println("File is already Exist12312");
            }

            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void JSONserializing(user u) {
        user.usersList.add(u);
        removeFileContent(Datetfile);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(user.usersList);
            writeJsonStringToFile(jsonString);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
    

    private void removeFileContent(File f) {
        try {
            new FileWriter(f.getPath(), false).close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void writeJsonStringToFile(String jsonString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Datetfile.getPath(), true))) {
            writer.write(jsonString);
            System.out.println("JSON string has been written to the file: " + Datetfile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<user> JSONDESERIALIZING() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Datetfile.getPath()))) {
            ObjectMapper objectMapper = new ObjectMapper();
            user.usersList = objectMapper.readValue(Datetfile,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, user.class));
            return user.usersList;
        } catch (IOException ex) {
            ex.printStackTrace();
            return Collections.emptyList();
        }
    }
    public List<Point> DESERIALIZINGPoint(String name) {
    File f = CreatePointFile("D:\\File Maneger\\", name);

    try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] coordinates = line.split(",");
            if (coordinates.length == 2) {
                double x = Double.parseDouble(coordinates[0].trim());
                double y = Double.parseDouble(coordinates[1].trim());

                int roundedX = (int) Math.round(x);
                int roundedY = (int) Math.round(y);

                NoteScreen.pointList.add(new Point(roundedX, roundedY));
                
            }
        }
        return NoteScreen.pointList;
    } catch (IOException | NumberFormatException ex) {
        ex.printStackTrace();
        return Collections.emptyList();
    }
}


    


}
