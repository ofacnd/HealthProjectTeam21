package pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


public class Test_Item {



    //    {
    //        "createdBy": "ogunes",
    //            "createdDate": "2022-07-21T14:00:10.086367Z",
    //            "id": 132000,
    //            "name": "cccs",
    //            "description": "ok",
    //            "price": 20.00,
    //            "defaultValMin": "15",
    //            "defaultValMax": "45"
    //    }

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String name;
    private String description;
    private String price;
    private String defaultValMin;
    private String defaultValMax;

    public Test_Item() {
    }

    public Test_Item(String createdBy, String createdDate, Integer id, String name, String description, String price, String defaultValMin, String defaultValMax) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    @Override
    public String toString() {
        return "Test_Item{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }







}
