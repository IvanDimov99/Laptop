import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Asus", 8, 512, "Windows", "Black"));
        laptops.add(new Laptop("HP", 16, 256, "Linux", "Gray"));
        laptops.add(new Laptop("Dell", 16, 1024, "Windows", "Silver"));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");

        System.out.print("Введите операционную систему: ");
        String os = scanner.nextLine();
        criteria.put("OperatingSystem", os);

        System.out.print("Введите минимальный объем ОЗУ: ");
        int ram = scanner.nextInt();
        criteria.put("RAM", ram);

        System.out.print("Введите минимальный объем жесткого диска: ");
        int storage = scanner.nextInt();
        criteria.put("Storage", storage);

        System.out.print("Введите цвет: ");
        scanner.nextLine();
        String color = scanner.nextLine();
        criteria.put("Color", color);

        List<Laptop> result = Laptop.filter(laptops, criteria);

        if (result.isEmpty()) {
            System.out.println("Ноутбука, соответствующего заданным критериям, не найдено.");
        } else {
            System.out.print("Результаты поиска: ");
            for (Laptop laptop : result) {
                System.out.println(laptop.getModel());
            }
        }
    }
}
