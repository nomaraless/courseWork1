public class EmployeeBook {
    private final Employee[] bookOfEmployees;
    private int size;

    public EmployeeBook() {
        this.bookOfEmployees = new Employee[10];
    }

    //Добавление сотрудника
    public void addEmployee(String fullName, int departament, double salary) {
        if (size >= bookOfEmployees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, departament, salary);
        bookOfEmployees[size++] = newEmployee;
    }

    //Удаление сотрудника
    public void deleteEmployee(String fullName) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i].getFullName().equals(fullName)) {
                System.out.println("Сотрудник: " + bookOfEmployees[i].getFullName() + " удален");
                System.arraycopy(bookOfEmployees, i + 1, bookOfEmployees, i, size - i - 1);
                bookOfEmployees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    //Поиск сотрудника по ID
    public void searchEmployee(int id) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getId() == id) {
                    System.out.println(bookOfEmployees[i].getFullName() + ": ID - " + id);
                } else {
                    System.out.println("Сотрудник не найден");
                }
            } else {
                break;
            }
        }
    }

    //Список всех сотрудников
    public void listOfAllEmployees() {
        for (int i = 0; ; i++) {
            int a = i + 1;
            if (bookOfEmployees[i] != null) {
                System.out.println(a + ") " + bookOfEmployees[i].toString());
            } else {
                System.out.println("Список окончен");
                break;
            }
        }
    }

    //Считает сумму всех ЗП
    public void sumOfAllSalary() {
        double sum = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                sum = sum + bookOfEmployees[i].getSalary();
            } else {
                System.out.println("Сумма затрат на ЗП: " + sum);
                break;
            }
        }
    }

    //Поиск сотрудника с минимальной ЗП
    public void searchEmployeeMinSalary() {
        double minSalary = bookOfEmployees[0].getSalary();
        int index = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() < bookOfEmployees[index].getSalary()) {
                    minSalary = bookOfEmployees[i].getSalary();
                    index = i;
                }
            } else {
                System.out.println("Минимальная ЗП: " + minSalary + " - " + bookOfEmployees[index].getFullName());
                break;
            }
        }
    }

    //Поиск сотрудника с максимальной ЗП
    public void searchEmployeeMaxSalary() {
        double maxSalary = bookOfEmployees[0].getSalary();
        int index = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() > bookOfEmployees[index].getSalary()) {
                    maxSalary = bookOfEmployees[i].getSalary();
                    index = i;
                }
            } else {
                System.out.println("Минимальная ЗП: " + maxSalary + " - " + bookOfEmployees[index].getFullName());
                break;
            }
        }
    }

    //среднее значение зп
    public void averageSalary() {
        double sum = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                sum += bookOfEmployees[i].getSalary();
            } else {
                double averge = (sum / i);
                System.out.println("Средняя ЗП: " + String.format("%.2f", averge));
                break;
            }
        }
    }

    //Печать списка сотрудников
    public void listOfEmployess() {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                int a = i + 1;
                System.out.println(a + ")" + bookOfEmployees[i].getFullName());
            } else {
                break;
            }
        }
    }

    //Индексация ЗП
    public void salaryIndexation(int a) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                double b = bookOfEmployees[i].getSalary();
                b += (b / 100.0 * a);
                bookOfEmployees[i].setSalary(b);
                System.out.println(bookOfEmployees[i].getFullName() + " - " + bookOfEmployees[i].getSalary());
            } else {
                break;
            }
        }
    }

    //Поиск минимальной ЗП по отделу
    public void minSalaryByDepartment(int a) {
        int index = 0;
        double minSalaryOfDepartament = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() <= bookOfEmployees[index].getSalary() && bookOfEmployees[i].getDepartament() == a) {
                    minSalaryOfDepartament = bookOfEmployees[i].getSalary();
                    index = i;
                }
            } else {
                System.out.println("Минимальная ЗП: " + minSalaryOfDepartament + " - " + bookOfEmployees[index].getFullName());
                break;
            }
        }
    }

    //Поиск максимальной ЗП по отделу
    public void maxSalaryByDepartment(int a) {
        int index = 0;
        double maxSalaryOfDepartament = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() >= bookOfEmployees[index].getSalary() && bookOfEmployees[i].getDepartament() == a) {
                    maxSalaryOfDepartament = bookOfEmployees[i].getSalary();
                    index = i;
                }
            } else {
                System.out.println("Максимальная ЗП: " + maxSalaryOfDepartament + " - " + bookOfEmployees[index].getFullName());
                break;
            }
        }
    }

    //Сумма ЗП по отделу
    public void sumSalaryByDepartment(int a) {
        double sum = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getDepartament() == a)
                    sum = sum + bookOfEmployees[i].getSalary();
            } else {
                System.out.println("Сумма затрат на ЗП: " + sum);
                break;
            }
        }
    }

    //Средняя ЗП по отделу
    public void avergeSalaryByDepartment(int a) {
        double sum = 0;
        int e = 0;
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getDepartament() == a) {
                    sum = sum + bookOfEmployees[i].getSalary();
                    e++;
                }
            } else {
                double averge = (sum / e);
                System.out.println("Средняя ЗП: " + String.format("%.2f", averge));
                break;
            }
        }
    }

    //Индексация ЗП по отделу
    public void salaryIndexationByDepartment(int department, int index) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getDepartament() == department) {
                    double b = bookOfEmployees[i].getSalary();
                    b += (b / 100.0 * index);
                    bookOfEmployees[i].setSalary(b);
                    System.out.println(bookOfEmployees[i].getFullName() + " " + bookOfEmployees[i].getSalary());
                }
            } else {
                break;
            }
        }
    }

    //Список сотрудника по отделу
    public void listOfEmployeesByDepartment(int department) {
        for (int i = 0; ; i++) {
            int a = i + 1;
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getDepartament() == department)
                    System.out.println(a + ") " + bookOfEmployees[i].getFullName() + ", ЗП - " + bookOfEmployees[i].getSalary() + ", ID - " + bookOfEmployees[i].getId());
            } else {
                System.out.println("Список окончен");
                break;
            }
        }
    }

    //Фильтр по ЗП меньше
    public void filterForSalaryLess(int salary) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() <= salary) {
                    System.out.println(bookOfEmployees[i].getFullName() + ", " + bookOfEmployees[i].getId() + ", " + bookOfEmployees[i].getSalary());
                }
            } else {
                System.out.println("Список окончен");
                break;
            }
        }
    }

    //Фильтр по ЗП больше
    public void filterForSalaryMore(int salary) {
        for (int i = 0; ; i++) {
            if (bookOfEmployees[i] != null) {
                if (bookOfEmployees[i].getSalary() >= salary) {
                    System.out.println(bookOfEmployees[i].getFullName() + ", " + bookOfEmployees[i].getId() + ", " + bookOfEmployees[i].getSalary());
                }
            } else {
                System.out.println("Список окончен");
                break;
            }
        }
    }
}