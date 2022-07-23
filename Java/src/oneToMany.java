// 학생과 코스 일대다
// 코스과 성적 다대일
// 220723

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private List<Transcript> transcript;

    public Student(String name) {
        this.name = name;
        this.transcript = new ArrayList<>();
    }

    public void setTranscript(Transcript transcript) {
        this.transcript.add(transcript);
    }

    public List<Transcript> getTranscript() {
        return this.transcript;
    }
}

class Transcript {
    private Cource cource;
    private Student student;

    private String grade;

    public Transcript(Student student, Cource cource) {
        student.setTranscript(this);
        this.student = student;
        cource.setTranscript(this);
        this.cource = cource;
    }

    public Cource getCource() {
        return cource;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Cource {
    private String name;
    private List<Transcript> transcript;

    public Cource(String name) {
        this.name = name;
        this.transcript = new ArrayList<>();
    }

    public void setTranscript(Transcript transcripts) {
        this.transcript.add(transcripts);
    }

    public String getName() {
        return name;
    }
}

public class oneToMany {
    public static void main(String[] args) {
        Student student1 = new Student("ree");
        Student student2 = new Student("bomi");

        Cource cource1 = new Cource("Science");
        Cource cource2 = new Cource("DataAnalyze");

        Transcript transcript = new Transcript(student1, cource1);
        transcript.setGrade("A+");
        Transcript transcript2 = new Transcript(student1, cource2);
        transcript2.setGrade("A0");


        for (Transcript transcript1 : student1.getTranscript()) {
            System.out.println(transcript1.getCource().getName());
        }

    }
}