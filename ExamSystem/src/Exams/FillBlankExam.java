/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exams;

/**
 *
 * @author Hussain'sMan
 */
public class FillBlankExam implements ExamType{


private String examType;

    @Override
    public void examType(String type) {
        this.examType =  type; 
    }


}
