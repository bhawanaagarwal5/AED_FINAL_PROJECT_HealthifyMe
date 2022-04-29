/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.MeditationInstructor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anky
 */
public class MeditationOrganization extends Organization{
     public MeditationOrganization() {
        super(Organization.Type.Meditation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MeditationInstructor());
        return roles;
    }
    
    
}