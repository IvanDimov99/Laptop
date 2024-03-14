import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;

public class Laptop {
    private String model;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int ram, int storage, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public static List<Laptop> filter(List<Laptop> laptops, Map<String, Object> criteria) {
        List<Laptop> result = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean matches = true;
            for (Map.Entry<String, Object> entry : criteria.entrySet()) {
                String criterion = entry.getKey();
                Object value = entry.getValue();
                switch (criterion) {
                    case "RAM":
                        if (laptop.getRam() < (int) value) {
                            matches = false;
                        }
                        break;
                    case "Storage":
                        if (laptop.getStorage() < (int) value) {
                            matches = false;
                        }
                        break;
                    case "OperatingSystem":
                        if (!laptop.getOperatingSystem().equals(value)) {
                            matches = false;
                        }
                        break;
                    case "Color":
                        if (!laptop.getColor().equals(value)) {
                            matches = false;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (matches) {
                result.add(laptop);
            }
        }

        return result;
    }
}
