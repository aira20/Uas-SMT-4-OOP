/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.Serializable;
        
public class Admin implements Serializable {
    private String announcement;

    public Admin() {
        this.announcement = "";
    }

    public void setNews(String announcement) {
        this.announcement = announcement;
    }

    public String getNews() {
        return announcement;
    }
}

/**
 *
 * @author Aria
 */
