import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Laptop {
    private String model;
    private String color;
    private String os;
    private int ram;
    private int hdd;

    public Laptop(String model, String color, String os, int ram, int hdd) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
    }

    public static List<String> propForFilter() {
        List<String> list = new ArrayList<>();
        list.add("модель");
        list.add("цвет");
        list.add("операционная работа");
        list.add("оперативная память");
        list.add("жесткий диск");

        return list;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "модель -> " + model +
                "; цвет -> " + color +
                "; операционная система -> " + os +
                "; оперативная память -> " + ram +
                "; жесткий диск -> " + hdd +
                "}";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Laptop laptop = (Laptop) obj;
        return laptop.model.equals(model) && laptop.color.equals(color) &&
                laptop.os.equals(os) && laptop.ram == ram &&
                laptop.hdd == hdd;
    }

    public int hashCode() {
        return Objects.hash(model, color, os, ram, hdd);
    }
}