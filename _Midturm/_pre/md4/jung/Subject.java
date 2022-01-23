package jung;
import java.util.ArrayList;

public class Subject {
    private ArrayList<String> ListSubjects = new ArrayList<String>();
    public Subject(String ListSubjects) {
        this.ListSubjects.add(ListSubjects);
    }
    public ArrayList<String> getListSubjects() {
        return ListSubjects;
    }
    public void setListSubjects(ArrayList<String> ListSubjects) {
        this.ListSubjects = ListSubjects;
    }
    public String toString() {
        String result = "";
        for (String subject : ListSubjects) {
            result += subject + " ";
        }
        return result;
    }

}
