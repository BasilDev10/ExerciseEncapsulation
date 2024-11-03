//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        accountQuestion();

        System.out.println("---------------------------------------------------------------------");

        employeeQuestion();




    }

    public static void accountQuestion(){
        Account account = new Account("103265497","Basil",5000);
        Account account2 = new Account();
        account2.setId("156153125");
        account2.setName("Mohammed");

        System.out.println("----------------------\nProgram started\n----------------------");
        System.out.println(account.toString());
        System.out.println("-----------------------");
        System.out.println(account2.toString());

        System.out.println("----------------------\nTransaction\n----------------------");
        System.out.println(account.debit(1000));
        System.out.println(account.debit(200000));
        System.out.println(account.credit(2000));
        System.out.println(account.transferTo(account2, 3500));
        System.out.println(account2.transferTo(account, 80000));
        System.out.println(account2.transferTo(account, -2000));
        System.out.println(account2.transferTo(account, 2000));

        System.out.println("----------------------\nPrint after transaction\n----------------------");
        System.out.println(account.toString());
        System.out.println("-----------------------");
        System.out.println(account2.toString());
    }

    public static void employeeQuestion(){
        Employee employee = new Employee("1231315123","Sami",10000);
        Employee employee1 = new Employee();
        employee1.setId("102312351");
        employee1.setName("Abdullah");
        employee1.setSalary(5000);
        System.out.println("------------------------\nPrinting employee before the raised\n------------------------");
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee1.raiseSalary(20));
        System.out.println("------------------------\nPrinting employee after the raised\n------------------------");
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
    }
}