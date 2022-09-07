public class Location {
    private String name;
    private Double weight;
    private Integer barcode = null;

    public Location(String name, Double weight, Integer barcode) {
        this.name = name;
        this.weight = weight;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }
}
