/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import examsystem.Notify;

/**
 *
 * @author Hussain'sMan
 */
public class Teacher implements Notify{
    
    private User userDetail;
    
    public Teacher(User user ){
        
        this.userDetail = user;
        
    }

    @Override
    public void update(String message) {
        System.out.println("Message is Updated : "+message);
    }
    
}
