package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)


public class Test {

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String defaultValMin;
    private String defaultValMax;

    public Test(String createdBy, String createdDate, Integer id, String name, String description, Double price, String defaultValMin, String defaultValMax) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }

    public Test() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "Test{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }
}