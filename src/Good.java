public class Good {
    private String name;
    private Float weight;
    private Integer barcode;

    public Good(String name, Float weight, Integer barcode) {
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }
}