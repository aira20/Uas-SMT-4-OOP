/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.io.Serializable;

/**
 *
 * @author Aria
 */
public class Account implements Serializable {
    private String username, password;
    


public String getUsername(){
    return username;
}
        
public String getPassword()
{
    return password;
}

}