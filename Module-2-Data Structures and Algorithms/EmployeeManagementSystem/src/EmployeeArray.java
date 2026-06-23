public class EmployeeArray {

    Employee[] employees =
            new Employee[10];

    int count = 0;

    public void add(
            Employee employee
    ) {

        employees[count] =
                employee;

        count++;

    }

    public void search(
            int id
    ) {

        for (
                int i = 0;
                i < count;
                i++
        ) {

            if (
                    employees[i]
                            .employeeId == id
            ) {

                employees[i]
                        .display();

                return;

            }

        }

        System.out.println(
                "Employee Not Found"
        );

    }

    public void traverse() {

        for (
                int i = 0;
                i < count;
                i++
        ) {

            employees[i]
                    .display();

        }

    }

    public void delete(
            int id
    ) {

        for (
                int i = 0;
                i < count;
                i++
        ) {

            if (
                    employees[i]
                            .employeeId == id
            ) {

                for (
                        int j = i;
                        j < count - 1;
                        j++
                ) {

                    employees[j] =
                            employees[j + 1];

                }

                count--;

                break;

            }

        }

    }

}