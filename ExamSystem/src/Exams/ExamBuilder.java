
package Exams;

/**
 *
 * @author Hussain'sMan
 */
public class ExamBuilder {
    private Exam exam;
    
    public ExamBuilder(Exam exam ){
        
       this.exam = exam;
    }
    public void createExams(){
        
        
    }
    public void setSchedule(Schedule shedule){
        exam.schedule = shedule;
        
        
    }
    
    public void setDuration(int totalTime){
        exam.totalTime = totalTime;
        
    }
    public void setInstructions(){
        
        
    }
    
    public Exam getExam(){
        
        return this.exam;
    }
    
    
    
}
