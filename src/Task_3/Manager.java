package Task_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Manager extends Employee{
    public Manager (String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = "";
    }
    public void raiseSalary(double byPercent){
// add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    @Override
    public int compare(Sortable b) {
        if (b instanceof Manager) {
            Manager mb = (Manager) b;
            // Bandingkan berdasarkan gaji
            if (getSalary() < mb.getSalary()) return -1;
            if (getSalary() > mb.getSalary()) return 1;
            return 0;
        } else {
            // Jika objek yang dibandingkan bukan instance dari Manager, kembalikan nilai default
            return super.compare(b);
        }
    }
    public String getSecretaryName(){
        return secretaryName;
    }
    private String secretaryName;

    public String toString() {
        return super.toString() + ", Sekretaris: " + secretaryName;
    }
}
