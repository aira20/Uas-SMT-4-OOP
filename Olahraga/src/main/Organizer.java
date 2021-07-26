/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Aria
 */
public class Organizer extends Account {
    private boolean register = false;
    private boolean block=true;


public Organizer (String username, String password)
{
    super (username e, password);
}

    /**
     *
     * @return
     */
    @Override
    public String getPassword()
{
    return super.getPassword();
}

    @Override
    public String getUsername()
{
    return super.getUsername();
}

public boolean Blockaccount()
{
return block;
}

public boolean Registeraccount()
{
return register;
}

public void setBlockaccount (boolean block)
{
    this.block = block;
}

public  void setRegister (boolean register)
{
    this.register = register;
}
}