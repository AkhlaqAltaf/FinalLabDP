/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import Exams.Exam;
import Exams.Schedule;
import examsystem.Notify;

/**
 *
 * @author Hussain'sMan
 */
public class Admin implements Notify{
    private  String role ;
    private Exam examDetail;
    private User userDetail;
    public Admin(User user){
        this.userDetail = user;
        
    }
    public void setRole(String Role){
        
        this.role = role;
    }
    public String getRole(){
        
        return this.role;
    }
    public void setSchedule(Schedule schedule){
        
    }
    
    public void setExamsDetail(Exam exam){
        
        this.examDetail =examDetail;
        
    }

    @Override
    public void update(String message) {
         System.out.println("Admin Notification....."+message);   

    }
    
}
