
package ex13_gra_tablizohl;

import java.util.*;

public class Subject {
    private String name, imgFileName;
    private double units, grade;
    private static ArrayList<Subject> subjectList = new ArrayList();
	
    public Subject(String n, String i, double u, double g){
        name = n;
        imgFileName = i;
        units = u; 
        grade = g;
        subjectList.add(this);
    }
    public String getName() {
        return name;
    }
    public String getImgFileName(){
        return imgFileName;
    }
    public double getUnits() {
        return units;
    }
    public void setUnits(double units) {
        this.units = units;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public static int getListLength() {
        return subjectList.size();
    }
    public static int getSubjectIndex(Subject s) throws NullPointerException {
        if(subjectList.contains(s)) return subjectList.indexOf(s);
        else throw new NullPointerException();
    }
    public static int getSubjectIndex(String s) throws NullPointerException {
        if(subjectList.contains(searchSubject(s))) return subjectList.indexOf(searchSubject(s));
        else throw new NullPointerException();
    }
    public static Subject searchSubject(String search) throws NullPointerException {
        for(Subject s : subjectList){
            if(s.getName().equalsIgnoreCase(search)) return s;
        }
        throw new NullPointerException();
    }
    public static Subject searchSubject(int index) throws IndexOutOfBoundsException {
        return subjectList.get(index);
    }
}
