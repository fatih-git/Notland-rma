public class Student {

    String name;
    String No;
    Course mat;
    Course fizik;
    Course kimya;
    double avg;
    int classes;
    boolean isPass;

    Student(String name, int classes, String No, Course mat, Course fizik, Course kimya){

        this.name=name;
        this.classes=classes;
        this.No=No;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvg();
        this.isPass=false;

    }

    public void addBulkExamNote(int mat, int fizik, int kimya){

        if (mat>=0 && mat<=100)
            this.mat.note=mat;

        if (fizik>=0 && fizik<=100)
            this.fizik.note=fizik;

        if (kimya>=0 && kimya<=100)
            this.kimya.note=kimya;

    }

    public void isPass(){

        if (this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0)
            System.out.println("Notlar eksik girilmiş.");
        else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalma= "+this.avg);
            if (this.isPass)
                System.out.println("Geçti.");
            else
                System.out.println("Kaldı.");
        }


    }

    public void calcAvg(){

        this.avg=(this.fizik.note+this.kimya.note+this.mat.note)/3;

    }

    public boolean isCheckPass(){

        calcAvg();

        return this.avg>55;
    }

    public void printNote(){

        System.out.println("-------------");
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Matematik Notu: "+this.mat.note);
        System.out.println("Fizik Notu: "+this.fizik.note);
        System.out.println("Kimya Notu: "+this.kimya.note);

    }

}
