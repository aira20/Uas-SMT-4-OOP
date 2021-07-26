/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
/**
 *
 * @author Aria
 */
public class User extends Account implements Level {
    private boolean Block = true;
    private boolean Register = false;
    
    /**
     *
     * @param username
     * @param password
     */
    public User(String username, String password)
    {
        super (username,password);
    }

    @Override
    public void LevelUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void LevelDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public String getUsername()
{
return super.getUsername();
}

    @Override
    public String getPassword()
    {
        return super.getPassword();
    }
    public boolean isBlock()
    {
        return getBlock();
    }
  
    public boolean isRegister()
    {
        boolean getRegister = false;
        return getRegister;
    }
    
    public void setBlock(boolean block)
    {
        boolean getBlock;
        getBlock = block;
    }

    private boolean getBlock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setRegister(boolean register)
    {
        boolean getRegister = register;
    }
    
    
}