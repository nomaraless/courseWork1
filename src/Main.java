public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("aaa", 1, 10000);
        employeeBook.addEmployee("bbb", 1, 10250);
        employeeBook.addEmployee("ccc", 1, 13000);
        employeeBook.addEmployee("ddd", 5, 25000);
        employeeBook.addEmployee("eee", 5, 6000);
        employeeBook.addEmployee("fff", 4, 14000);
        employeeBook.addEmployee("ggg", 4, 11000);
        employeeBook.addEmployee("hhh", 3, 17000);

        employeeBook.filterForSalaryLess(16000);
        System.out.println();
        employeeBook.averageSalary();
        System.out.println();
        employeeBook.listOfAllEmployees();
        System.out.println();
        employeeBook.maxSalaryByDepartment(5);
        employeeBook.avergeSalaryByDepartment(1);
        employeeBook.searchEmployee(6);
        employeeBook.minSalaryByDepartment(4);
        employeeBook.salaryIndexation(50);
        employeeBook.filterForSalaryMore(14000);
        employeeBook.searchEmployeeMaxSalary();
    }
}