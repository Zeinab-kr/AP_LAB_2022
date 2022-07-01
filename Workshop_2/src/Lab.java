public class Lab {
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize = 0;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
    }

    public void calAvg() {
        double sum = 0;
        for (int i = 0; i < maxSize; i++) {
            sum += students[i].getGrade();
        }
        this.avgGrade = (sum / maxSize);
    }

    public void enrollStudent(Student student) {
        students[currentSize] = student;
    }

    public void printLabInfo() {
        System.out.println("\nteacher name: " + teacherName +
                "\nday of week: " + dayOfWeek +
                "\nMax size student: " + maxSize);
    }

    // setters
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
        currentSize = students.length;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    // getters

    public String getTeacherName() {
        return teacherName;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }
}
}
