package Task_3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 3500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Naikkan gaji semua pegawai sebesar 5%
        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        // Cetak detail setiap pegawai sebelum diurutkan
        System.out.println("Sebelum pengurutan:");
        for (Employee employee : staff) {
            employee.print();
        }

        // Urutkan array staff berdasarkan gaji menggunakan shell_sort dari kelas Sortable
        Sortable.shell_sort(staff);

        // Cetak detail setiap pegawai setelah diurutkan
        System.out.println("\nSetelah pengurutan:");
        for (Employee employee : staff) {
            employee.print();
        }
    }
}
