import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();

        Laptop lt0 = new Laptop("Aplle Air UltraMegaMax Pro", "Golden", "MacOS", 8, 512);
        Laptop lt1 = new Laptop("Gigabyte G5", "Black", "Windows 10", 16, 512);
        Laptop lt2 = new Laptop("Asus a515", "White", "Ubuntu 20.04.4", 4, 256);

        laptops.add(lt0);
        laptops.add(lt1);
        laptops.add(lt2);

        filterAndPrint(getUserFilteringCriterion(), getMinFilterValue(), laptops);
    }

    public static int getUserFilteringCriterion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите нужный критерий(введите соответствующую цифру):");
        System.out.println("1 - Модель");
        System.out.println("2 - Цвет");
        System.out.println("3 - Операционная система");
        System.out.println("4 - ОЗУ");
        System.out.println("5 - объем ЖД");

        int criterion = scanner.nextInt();

        return criterion;
    }

    public static String getMinFilterValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальное значение выбранного критерия: ");

        String minValue = scanner.nextLine();
        scanner.close();
        return minValue;
    }

    public static void filterAndPrint(int criterion, String value, Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            switch (criterion) {
                case 1:
                    if (laptop.getModel().toLowerCase().contains(value.toLowerCase())) {
                        System.out.println(laptop);
                    }
                    break;
                case 2:
                    if (laptop.getColor().toLowerCase().contains(value.toLowerCase())) {
                        System.out.println(laptop);
                    }
                    break;
                case 3:
                    if (laptop.getOs().toLowerCase().contains(value.toLowerCase())) {
                        System.out.println(laptop);
                    }
                    break;
                case 4:
                    if (laptop.getRam() >= Integer.parseInt(value)) {
                        System.out.println(laptop);
                    }
                    break;
                case 5:
                    if (laptop.getHdd() >= Integer.parseInt(value)) {
                        System.out.println(laptop);
                    }
                    break;
                default:
                    continue;

            }
        }
    }
}