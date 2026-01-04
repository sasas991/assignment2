class Student extends Person {
    private static final double stipend=36660.00;
    private static final double mingpa=2.67;
    private double gpa;

    public Student()
    {
        super();
        this.gpa=0.0;
    }

    public Student(String name, String surname, double gpa)
    {
        super(name, surname);
        this.gpa=gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa=gpa;
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount(){
        return (gpa>mingpa) ? stipend : 0.0;
    }

    @Override
    public String toString()
    {
        return "Student: "+super.toString();
    }
    @Override
    public int compareTo(Person other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
