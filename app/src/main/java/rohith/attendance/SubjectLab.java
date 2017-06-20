package rohith.attendance;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/*
 * This is a SINGLETON class
**/

public class SubjectLab {

    private ArrayList<Subject> subjects = new ArrayList<>() ;

    // This will be the sole instance of this class ; No other instances are allowed
    private static SubjectLab subjectLab ;

    // The context variable that'll be used by this class
    private Context context ;

    private SubjectLab(Context c){
        context = c ;

        for (int i = 0 ; i < 5 ; i++){
            Subject sub = new Subject() ;
            sub.setName("Subject " + i);
            sub.setBunks(0);
            sub.setCurrentPercentage(100.00);
            sub.setMinPercentage(75.00);
            sub.setTotalClasses(20);
            subjects.add(sub) ;
        }
    }

    public static SubjectLab get(Context c){
        if (subjectLab == null){
            subjectLab = new SubjectLab(c.getApplicationContext()) ;
        }
        return subjectLab ;
    }

    public ArrayList<Subject> getSubjects(){
        return subjects ;
    }

    public Subject getSubject(UUID userid){
        for(Subject s : subjects){
            if (s.getSubjectID() == userid){
                return s ;
            }
        }
        return null ;
    }

    public void addSubject(Subject subject){
        subjects.add(subject) ;
    }
}