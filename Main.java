void main() {
    Scanner scanner = new Scanner(System.in);


    ArrayList<String> lastNames = new ArrayList<>();
    ArrayList<String> firstNames = new ArrayList<>();
    ArrayList<Integer> groups = new ArrayList<>();


    lastNames.add("Иванов");
    lastNames.add("Петров");
    lastNames.add("Сидорова");


    firstNames.add("Иван");
    firstNames.add("Петр");
    firstNames.add("Мария");


    groups.add(101);
    groups.add(102);
    groups.add(101);
    int choice = 9;
    while (choice != 0) {
        System.out.println("Поиск студента:");
        System.out.println("1 - по фамилии");
        System.out.println("2 - по имени");
        System.out.println("3 - по группе");
        System.out.println("4 - чтобы добавить пользователя");
        System.out.println("5 - чтобы удалить пользователя");
        System.out.println("0 - чтобы выйти");
        System.out.print("Выберите вариант: ");

        choice = scanner.nextInt();
        scanner.nextLine();

            if (choice == 1) {
                System.out.print("Введите фамилию: ");
                String searchLastName = scanner.nextLine();

                System.out.println("\nРезультаты поиска:");
                for (int i = 0; i < lastNames.size(); i++) {
                    if (lastNames.get(i).equalsIgnoreCase(searchLastName)) {
                        System.out.println(lastNames.get(i) + " " + firstNames.get(i) + ", группа " + groups.get(i));
                    }
                }

            } else if (choice == 2) {
                System.out.print("Введите имя: ");
                String searchFirstName = scanner.nextLine();

                System.out.println("\nРезультаты поиска:");
                for (int i = 0; i < firstNames.size(); i++) {
                    if (firstNames.get(i).equalsIgnoreCase(searchFirstName)) {
                        System.out.println(lastNames.get(i) + " " + firstNames.get(i) + ", группа " + groups.get(i));
                    }
                }

            } else if (choice == 3) {
                System.out.print("Введите группу: ");
                int searchGroup = scanner.nextInt();

                System.out.println("\nРезультаты поиска:");
                for (int i = 0; i < groups.size(); i++) {
                    if (groups.get(i) == searchGroup) {
                        System.out.println(lastNames.get(i) + " " + firstNames.get(i) + ", группа " + groups.get(i));
                    }
                }

            } else if (choice == 4) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите фамилию:");
                String lname = scanner.nextLine();
                System.out.println("Введите группу:");
                int grou = scanner.nextInt();

                firstNames.add(name);
                lastNames.add(lname);
                groups.add(grou);

                System.out.println("Пользователь успешно добавлен!");

            } else if (choice == 5) {

                System.out.print("Введите фамилию: ");
                String deleteLastName = scanner.nextLine();
                System.out.print("Введите имя: ");
                String deleteFirstName = scanner.nextLine();

                boolean found = false;
                for (int i = 0; i < lastNames.size(); i++) {
                    if (lastNames.get(i).equalsIgnoreCase(deleteLastName) &&
                            firstNames.get(i).equalsIgnoreCase(deleteFirstName)) {

                        lastNames.remove(i);
                        firstNames.remove(i);
                        groups.remove(i);
                        found = true;
                        System.out.println("Пользователь " + deleteLastName + " " + deleteFirstName + " удален!");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Пользователь не найден!");
                }

            }

            System.out.println("\nТекущий список пользователей:");
            for (int i = 0; i < lastNames.size(); i++) {
                System.out.println(lastNames.get(i) + " " + firstNames.get(i) + ", группа " + groups.get(i));
            }

        }

    }

