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
public class Student implements Notify{
    private User userDetail ;
    public Student(User user){
        
        this.userDetail = user;
    }

    @Override
    public void update(String message) {
             System.out.println("Student Notify .."+message);
    }
    
}
