public class TaskManagementTest {

    public static void main(
            String[] args
    ) {

        TaskLinkedList tasks =
                new TaskLinkedList();

        tasks.addTask(
                1,
                "Design",
                "Pending"
        );

        tasks.addTask(
                2,
                "Development",
                "Completed"
        );

        tasks.addTask(
                3,
                "Testing",
                "In Progress"
        );

        System.out.println(
                "All Tasks"
        );

        tasks.traverse();

        System.out.println();

        System.out.println(
                "Search"
        );

        tasks.searchTask(
                2
        );

        tasks.deleteTask(
                2
        );

        System.out.println();

        System.out.println(
                "After Delete"
        );

        tasks.traverse();

        System.out.println();

        System.out.println(
                "Add -> O(n)"
        );

        System.out.println(
                "Search -> O(n)"
        );

        System.out.println(
                "Delete -> O(n)"
        );

    }

}