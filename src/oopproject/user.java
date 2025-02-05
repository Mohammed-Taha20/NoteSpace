/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author PC
 */
public class user implements Serializable {

    String First_name;
    String Second_name;
    String user_name;
    String password;
    int day = 0;
    String month = "january";
    int year = 2032;
    String Email;
    boolean sign = false;
    String Content;
    String ContentText;
    static List<user> usersList = new ArrayList<>();
    int fileCounter;
//    Empty Constructor
    public user() {
    }
//    Text Constructor saving

    public user(String First_name, String Second_name, String user_name, String password, String Email, String Content, String ContentText, int count) {
        this.First_name = First_name;
        this.Second_name = Second_name;
        this.user_name = user_name;
        this.password = password;
        this.Email = Email;
        this.Content = Content;
        this.ContentText = ContentText;
        this.fileCounter = count;

    }
//    Sign Constructor

    public user(String First_name, String Second_name, String user_name, String password, String Email, boolean sign, int count) {
        this.First_name = First_name;
        this.Second_name = Second_name;
        this.user_name = user_name;
        this.password = password;
        this.Email = Email;
        this.sign = sign;
        this.fileCounter = count;
    }

    public void setFileCounter(int fileCounter) {
        this.fileCounter = fileCounter;
    }

    public int getFileCounter() {
        return fileCounter;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isSign() {
        return sign;
    }

    public void setContentText(String ContentText) {
        this.ContentText = ContentText;
    }

    public String getContentText() {
        return ContentText;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "user{" + "First_name=" + First_name + ", Second_name=" + Second_name + ", user_name=" + user_name + ", password=" + password + ", day=" + day + ", month=" + month + ", year=" + year + ", Email=" + Email + ", sign=" + sign + ", Content=" + Content + ", ContentText=" + ContentText + '}';
    }

    public user(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;

    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getSecond_name() {
        return Second_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
