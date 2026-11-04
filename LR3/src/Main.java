//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    class Employee {
        String fullname;
        double salary;

        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }
    class Report {
        static void generateReport(Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%-15s %10.2f%n", arr[i].fullname, arr[i].salary);
            }
        }
    }
    Scanner in = new Scanner(System.in);
    System.out.println("Введите номер задания");
    int zadanie = in.nextInt();
    switch (zadanie){
        case 1:
            String s;
            System.out.println("Введите строку");
            in.nextLine();
            s = in.nextLine();
            System.out.println(s);
            System.out.println(s.replace('е','и'));
            break;
        case 2:
            String s2 = new String();
            System.out.println("Введите строку");
            in.nextLine();
            s2 = in.nextLine();
            StringBuilder result = new StringBuilder();
            result.append(s2.charAt(0));
            for (int i = 1; i < s2.length(); i++) {
                if (s2.charAt(i) != s2.charAt(i - 1)) {
                    result.append(s2.charAt(i));
                }
            }
            System.out.println(result);
            break;
        case 3:
            Employee[] arr = new Employee[3];
            arr[0] = new Employee("Ivanov", 50000.50);
            arr[1] = new Employee("Petrov", 60000.00);
            arr[2] = new Employee("Sidorov", 45000.75);
            Report.generateReport(arr);
            break;
        case 4:
            String s4 = "a1a a22a a333a a4444a a55555a";
            Pattern pattern = Pattern.compile("a[02468]+a");
            Matcher matcher = pattern.matcher(s4);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            break;
        default:
            System.out.println("Такого задания нет");
            break;
    }
}
