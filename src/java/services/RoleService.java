/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import dataaccess.RoleDB;
import java.util.ArrayList;
import java.util.List;
import models.Role;

/**
 *
 * @author 749300
 */
public class RoleService {
    /**
     * This method calls the getAll() method from UserDB.
     * @return userList - a list of users from the database.
     * @throws Exception - all exceptions that could be had.
     */
    public List<Role> getAll() throws Exception {
        RoleDB db = new RoleDB();
        ArrayList<Role> RoleList = (ArrayList<Role>) db.getAll();
        ArrayList<Role> activeRole = new ArrayList<>();
        
        for (int i = 0; i < RoleList.size(); i++) {
             activeRole.add(RoleList.get(i));
           
        }
        return activeRole;
    }
     /**
     * @Author David and Ayden With leadership from Ember
     * @param RoleID
     * @param RoleName
     * @return
     * @throws Exception 
     */
    public int update(int RoleID,String RoleName) throws Exception {
        
        RoleDB rb = new RoleDB();
        
        Role role = new Role(RoleID,RoleName);
        int i = rb.update(role);
        return i;
    }
     /**
     * @Author David and Ayden With leadership from Ember
  
     * @throws Exception - all exceptions that could be had.
     */
    public int insert(int RoleID, String RoleName) throws Exception {
        RoleDB rb = new RoleDB();
        Role role = new Role();
        int i = rb.insert(role);
        return i;
    }

   
    
}
