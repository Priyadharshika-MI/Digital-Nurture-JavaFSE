public class EmployeeTest {

    public static void main(
            String[] args
    ) {

        EmployeeArray list =
                new EmployeeArray();

        list.add(
                new Employee(
                        101,
                        "Priya",
                        "Developer",
                        60000
                )
        );

        list.add(
                new Employee(
                        102,
                        "John",
                        "Manager",
                        80000
                )
        );

        list.add(
                new Employee(
                        103,
                        "David",
                        "Tester",
                        50000
                )
        );

        System.out.println(
                "Employees"
        );

        list.traverse();

        System.out.println();

        System.out.println(
                "Search"
        );

        list.search(
                102
        );

        list.delete(
                102
        );

        System.out.println();

        System.out.println(
                "After Delete"
        );

        list.traverse();

        System.out.println();

        System.out.println(
                "Add -> O(1)"
        );

        System.out.println(
                "Search -> O(n)"
        );

        System.out.println(
                "Traverse -> O(n)"
        );

        System.out.println(
                "Delete -> O(n)"
        );

    }

}