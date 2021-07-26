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
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
        
        

public class Olahraga {
    
    ArrayList<Admin> adminlog = new ArrayList<>();
    ArrayList<User> userlog = new ArrayList<>();
    ArrayList<Organizer> orglog = new ArrayList<>();
    ArrayList<Event> activities = new ArrayList<>();

    String FileUser = "user.txt"; 
    String FileAdmin = "admin.txt";
    String FileOrganizers = "organizer.txt"; 
    String FileActivities = "Event.txt";
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           try
    {
               try (ObjectInputStream inAdmin = new ObjectInputStream(new FileInputStream(FileAdmin))) {
                   Admin = (ArrayList<Admin>) inAdmin.readObject();
               }
        
        ObjectInputStream inPlayer = new ObjectInputStream (new FileInputStream(FileUser));
        User = (ArrayList<User>) inUser.readObject();
        inUser.close();
        
        ObjectInputStream inOrganizers = new ObjectInputStream (new FileInputStream(FileOrganizers));
        Organizer = (ArrayList<Organizer>) inOrganizers.readObhect();
        inOrganizer.close();
        
        ObjectActivities inActivities = new ObjectInputStream (new FileInputStream(FileActivities));
        Event = (ArrayList<Event>) inUser.readObject();
        inUser.close();
        
    }
          catch(IOException ex) 
          {
            System.out.println("No Data Inside");
          } 
           catch(ClassNotFoundException ex) 
          {
            System.out.println("Error");
          }
    }
    
    do
    {
       firstpage(Admin);
       int choice;
       String SE;
       Scanner read = new Scanner(System.in);
        try{
        System.out.println("Input Choice: ");
        }
        catch (exception e)
        {
            System.out.println("Incorrect choice!");
            choice = 3;
        }
     switch(choice)
     {
         case 1:
         {
             login(orglog, userlog, adminlog );
             break;
         }
         case 2:
         {
         create_acc(orglog, userlog);
         }
         case 3:
         {
             do
         {
             
             System.out.println("Save and Exit?");
             SE = read.nextInt();
             
         }
             while(!SE.equals"yes");
             if(!keluar.equals("yes"))
             {        
             saving(orglog, userlog, activities, adminlog, FileOrganizers, FileUser, FileActivities, FileAdmin);
         }
         }
            
     } while(choice!=3);
        
        
    }
    private static void saving(ArrayList<Organizer> organizers, ArrayList<User> userlog, ArrayList<Event> activities, ArrayList<Admin> adminlog1, String FileUser, String FileOrganizers, String FileActivities, String FileAdmin) {
        try
        {
            //Saving of object in a file
            //tims
            ObjectOutputStream outOrganizer = new ObjectOutputStream(new FileOutputStream(fileOrganizers));
            outOrganizer.writeObject(organizers);

            //pemain
            ObjectOutputStream outPemains = new ObjectOutputStream(new FileOutputStream(filePemains));
            outPemains.writeObject(pemains);

            //kegiatan
            ObjectOutputStream outKegiatan = new ObjectOutputStream(new FileOutputStream(fileKegiatan));
            outKegiatan.writeObject(kegiatans);

            //admin
            ObjectOutputStream outAdmin = new ObjectOutputStream(new FileOutputStream(fileAdmin));
            outAdmin.writeObject(admin);

            System.out.println("\nDONE SAVE");

        }
        catch(IOException ex)
        {
            System.out.println("Error SAVE DATA");
        }
    }
    
    
    private static void PlayerLogin (ArrayList<User> userlog, ArrayList<Event> activities)
    {
        
        int choice;
        
        do
        {
            System.out.println("======================");
            System.out.println("||     User Menu     ||");
            System.out.println("======================");
            System.out.println("1. Create an Account\n");
            System.out.println("2. Login to an Existing Account\n");
            
            System.out.println("Choose your Choice: ");
            Scanner read = new Scanner(System.in);
            try{
                choice = read.nextInt();
            }
            catch(Exception e)
            {
                System.out.print("No choice!");
                choice = 4;
            }
            
            switch (choice)
            {
                case 1:{
                    String username, password;
                    
                do
                {
                    System.out.print ("Insert Username: ");
                    username = read.nextLine();
                } 
                while (username.length()>100 || username.length()<4);
                
                
                for(User p : userlog)
                {
                    if (p.getUsername() = equals(username))
                    {
                        System.out.println("Error");
                    }
                }
                
               do
               {
                   System.out.print("Insert a password: ");
                   password = read.nextLine();
                     
               if (password.length()>50)
               {
                   System.out.println("Password too long");
               }
               if (password.length()<5)
               {
                   System.out.println("Password too short");
               }
                  
               
               } while (password.length()>15 || password.length()<1);
               
              System.out.println("Success!");
            break;  
            
              
                
            }
                case 2: 
                {
                    String username, password;
                    boolean status = false, correct = false;
                    
                    if (userlog.size()>0){ 
                System.out.print("Insert your Username: \n");
                    username = read.nextLine();
                System.out.print("Insert your Password: \n");
                    password = read.nextLine();
                    
                    for(User p : userlog)
                    {
                        if (p.getUsername().equals(username) && p.getPassword().equals(password))
                        {
                            correct = true;
                            if (p.isBlock() && p.isRegister())
                            {
                                status = true;
                            }
                        }
                    }
                    if (!correct)
                    {
                        System.out.println ("Incorrect Usernmae or password");
                    }
                    else if (!status)
                            {
                            System.out.println("You logged into a blocked Account!");
                            } else
                            {
                            PlayerMenu(userlog, activities, username);
                            }
                    }else{
                            System.out.println("Create an Account!");
                            }
                    break;
                    
                }
                default:
                {
                    System.out.println("Error!");
                    break;
                }

            }
    } while(choice!=2);
    
}
    private static void PlayerMenu (ArrayList<User> userlog, ArrayList<Event> activities, String username)
    {
        
        int choice;
        
        do
        {
            
            System.out.println("=====================");
            System.out.println("||  Player Menu  ||\n");
            System.out.println("=====================");
            System.out.println("1. My Levela");
            System.out.println("2. Register an Event");
            System.out.println("3. Cancel Registration");
            
            System.out.println("4. EXIT");
            System.out.print("Option : ");
            Scanner read = new Scanner(System.in);
            try
            {
                choice = read.nextInt();
            }catch (Exception e)
            {
                System.out.print("No options");
                choice = 5;
            }
            
            
        switch (choice)
        {
            case 1 : 
            {
                userlog.stream().map((User p) -> {
                    if (p.getUsername().equals(username))
                        System.out.println("===================");
                    System.out.println("||     LEVEL     ||");
                    System.out.println("===================");
                    return p;
                }).forEachOrdered((User p) -> {
                    System.out.println("    %1d    ",p.getLevel());
                });
            }
                 
            case 2 :
            {
             if (activities.size()>0)
               {
                   
                   ViewEvent(activities);
               }
            
            do
            {
                System.out.println("Enter a choice: ");
              try
              {
                  choice = read.nextInt();
              }
        catch (Exception e)
              {
                  choice = 0;
              }      
                
            }
        while (choice<1 || choice>activities.size());
        
        choice = choice-1; 
        Event a = activities.get(choice);
            if (!a.isAvail() || a.isFull())
            {
                System.out.println("Unavailable");
            }
            else if (a.isFull())
            {
                System.out.println("Registration Full");
            }
            else
            {
                for (User u : userlog)
                        {
                            if(u.getUsername().equals(username))
                                    {
                                        u.LevelUp();
                                    }
                        }            
              }
            }
            a.AddPlayer(username);
            System.out.println("Success!");
            
            case 3:
            {
                int year = Calendar.getInstance().get(Calendar.YEAR);
            
                String cancel;
                boolean available;
                    available = false;
               System.out.print("Which Event are you planning to cancel?: ");
               cancel = read.nextLine();
               
                for (Event a : activities) {
                    if(a.getPlayers().contains(username)&&a.getName().equals(cancel)&& a.isAvail())
                    {
                        available=true;
                        userlog.stream().filter(u -> (a.getName().equals(username))).filter(u -> (year<a.getYear())).map(u -> {
                            u.LevelDown();
                            return u;
                        }).map(_item -> {
                            a.RemovePlayer(username);
                            return _item;
                        }).forEachOrdered(_item -> {
                            System.out.println("Removed Player");
                        });
                        
                    }else System.out.println("Error!");
                }
               
            }

        }
        
       
        
        
        
            }while (choice!=3);
    }
    
    public static void AdminMenu (ArrayList<Organizer> orglog, ArrayList<User> userlog, ArrayList<Admin> admin)
    {
            int choice;
            do
            {
                System.out.println("=================");
                System.out.println("||  ADMIN MENU  ||");
                System.out.println("=================");
		System.out.println("1.Post News");
		System.out.println("2.Register an Account");
		System.out.println("3.Block an Account");
		System.out.println("4.EXIT");
		System.out.print("Input Choice: ");
                Scanner scan = new Scanner(System.in);
            try
            {
                choice = scan.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Error choosing option!");
                choice = 5;
            }
            scan.nextLine();
            
        switch(choice)
        {
            case 1:
            {
                
                String announcement;
                Scanner read = new Scanner(System.in);
                System.out.println("Insert an announcement");
                announcement = read.nextLine();
                admin.setNews(announcement);
                System.out.println("Announcement Updated!");
                
            }
            case 2:
            {
                
                int choice = 0;
                
                do
                {
                    System.out.println("==========================");
                    System.out.println("|| Register An account! ||");
                    System.out.println("==========================");
                    
                    System.out.println("1. Register User\n");
                    System.out.println("2. Reguster Organizer\n");
                    System.out.println("3. EXIT?\n");
                    
                    
                    
                    System.out.println("Choose an option: ");    
                Scanner cek = new Scanner(System.in);    
                
                while (choice !=4);
               switch (choice)
               {
                   case 1 : 
                   { 
                     
                      int options;
                       if (userlog.size()>0)
                       {
                           System.out.println("============================================");
                           System.out.println("|  USERNAME  ===  REGISTERED  ===  STATUS  |");
                           System.out.println("============================================");
                           
                           userlog.stream().map(u -> {
                               System.out.println("%-10s |", u.getUser);
                              return u;
                          }).map(u -> {
                              if (u.Registeraccount())
                              {
                                  System.out.println("Acc Reg!");
                              }
                              return u;
                          }).forEachOrdered(u -> {
                              if (u.Blockaccount())
                              {
                                  System.out.println("Blocked!");
                              }
                              else
                              {
                                  System.out.println("Acc not Blocked!");
                              }
                          });
                                   
                           do
                           {
                               options = cek.nextInt();
                               System.out.print(choice);
                               System.out.println("Insert name of User: ");
                           }
                           while   
                                       (options<1 || options>userlog.size());    
                           options=options-1;
                           User u = userlog.get(options);
                           u.setRegister(true);
                           System.out.println("Success Registeration!");
                       }
                       else 
                       {
                           System.out.println("error input");
                           break;
                       }
                       
                   }
                   case 2 :
                   {
                       int options;
                       if (orglog.size()>0)
                       {         
                            System.out.println("============================================");
                           System.out.println("|  USERNAME  ===  REGISTERED  ===  STATUS  |");
                           System.out.println("============================================");
                           
                           for(User u : userlog)
                           {
                               System.out.println("%-10s |", u.getUser);
                               if (u.Registeraccount())
                               {
                                   System.out.println("Acc Registered!");
                               } 
                               else 
                               {
                                   System.out.println("Not Registered")
                               }
                               
                               if (u.Blockaccount())
                               {
                                   System.out.println("Blocked!");
                               }
                               else
                               {
                                   System.out.println("Acc Available!");
                               }
                           do
                           {
                               options = cek.nextInt();
                               System.out.print(choice);
                               System.out.print("Insert name of Organizer: ");
                               
                           }
                           while
                                       (options<1 || options>orglog.size;             
                                int name;
                                name = options=options-1;
                            User a;
                                a = orglog.get(options);
                            a.setRegister(true);
                            System.out.println("Success Registeration!");
                                   
                       } 
                       
                   }
                       else 
                       {
                           System.out.println("error input");
                           break;
                       }
                   }
                   case 3 :
                   {
                       System.out.println("Exiting...");
                       break;
                   }
                   default:
                   {
                       System.out.println("Error!");
                       break;
                   }
               
            }
                }
                while (choice!=3);
                }
        }
            }
            while (choice!=4);
}
    
    public static void OrganizerMenu (ArrayList<Admin> adminlog, ArrayList<User>userlog, 
            ArrayList<Organizer>orglog, ArrayList<Event>activities, String username)
          
    {
        int choice;
        do
        {
            System.out.println("==   Organization Menu   ==");
            System.out.println("1. View Activities");
            System.out.println("2. Add Event");
            System.out.println("3. Edit an Event");
            System.out.println("4. Exit\n");
            System.out.println("Choice: ");
            
            
            Scanner read = new Scanner(System.in);
            choice = read.nextInt();
            
            switch (choice)
            {
                case 1: ViewEvent(activities);
                break;
            
            
            case 2:
            {
            String level, place, name, sports;
           // int year, month, year, maxplayer, minplayer, price;
            //Difficulty
           do
           {       
               level = read.nextLine();
               System.out.println("Level | easy | medium | difficult |\n ");
               
           }
           while (!level.equals("easy")&&!level.equals("medium")
                   && !level.equals("difficult"));
           //Name
           do
           {        
               name = read.nextLine();
               System.out.println("Insert activity: ");
               
           }
           while (name.length()<1 || name.length()>100);
           //Place
           do
           {
               place = read.nextLine();
               System.out.println("Insert Place: ");
               
           }
           while (place.length()<1 || place.length()>50);
           
           do
           {
               
               System.out.println("Sport options [Badminton | Tenis | Renang | GYM] ");
               System.out.println("Insert Sport: ");
               sports = read.nextLine();
           }
           while  (!sports.equals("Badminton") && !sports.equals("Tenis") && !sports.equals("Renang") 
                   && !sports.equals("GYM"));
           
           //date
            do{
            System.out.print("Which date are you planning for? 1-31 : ");
            try{
                date = read.nextInt();
            }catch (Exception e){
                System.out.print("Error\n");
                 date=0;
            }

            }while (date<1 || date>31);
            
            //bulan

            do{
                        System.out.print("Whcih month? 1-12 : ");
                        try{
                            month = read.nextInt();
                        }catch (Exception e){
                            System.out.print("Error\n");
                            month=0;
                        }
                 
                    }while (month<1 || month>12);

                    //tahun
                    do{
                        System.out.print("Which year? [2021 < 3000]: ");
                        try{
                            year = read.nextInt();
                        }catch (Exception e){
                            System.out.print("Error\n");
                            year=0;
                        }
 
                    }while (year<2021 || year>3000);

                    //jumlahMin
                    do{
                        System.out.print("Masukkan jumlah pemain minimal : ");
                       
 
                    }while (minplayer<1 || minplayer>40);

                    //jumlahMax
                    do{
                        System.out.print("Masukkan jumlah pemain maksimal : ");
                      

                    }while (maxplayer<minplayer || maxplayer>999);

                    //biaya
                    do{
                        System.out.print("Masukkan biaya pendaftaran : ");
                       
                    }while (price<1 || price>99999999);

                    Event.add(new Event(name, username, sports, level, year, month, year,minplayer, maxplayer, price));
                    System.out.println("\nSccuess");
                    break;
                }
            case 3:
            {
                EditEvent(activities);
                break;
            }
            case 4: 
            {
                System.out.println("Exiting...");
                break;
            }

        }
        }
        while (choice!=4);
    }
    
    public static void EditEvent (ArrayList<Event> activities)
    {
        String event, temp;

        boolean avail = false;
        Scanner read = new Scanner(System.in);
        do 
        {
            System.out.println("Event Name: ");
            event = read.nextLine();
            for(Event e : activities)
            {
                if(e.getOrganizer().equals(Event)) {
                } else {
                    avail = true;
                }
            }
        }
        while(!avail);
        System.out.println("Edit? ");
        if (!temp.equals("yes"))
                {
                    temp = read.nextLine();
                    for(Event e: activities)
                    {
                        if(e.getName()equals.(name)&&e.getOrganizer().equals(Event))
                        {
                            if (e.isAvail()==true)
                            {
                                e.setAvail(false);
                            }
                            else e.setAvail(true);
                        }
                    }
                }
        else
        {
            System.out.println("Going back");
        }
        
        

    }
    
    public static void ViewEvent (ArrayList<Event> activities)
    {
        int num = 1;
        System.out.println("========================================");
        System.out.println("|         Activities Available         |");
        System.out.println("========================================");
        System.out.println("============================================================================================================================================================");
        System.out.println("|        Name        |     Sports     | Difficulty | dd/mm/yy        | Place               | Min Players | Max Players| Current Players | Price    | Status |");
        System.out.println("============================================================================================================================================================");

        for (Event e : activities){
            System.out.printf("| %-14s | %-13s | %-5s | %-2d - %-2d - %-4d | %-20s | %-11d | %-11d | %-16d | %-8d |",  e.getName(), e.getSports(), e.getlevel(), e.getDate(), e.getMonth(), e.getYear(), e.getPlace()
                    , e.getMinplayers(), e.getMaxplayers(), e.getCurrentplayer(), e.getPrice());
            if (e.isAvail()){
                System.out.println(" Available  |");
            } else System.out.println(" Unavailable  |");
        
        }
        

    }
    }
    


    

