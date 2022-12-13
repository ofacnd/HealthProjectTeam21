package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties

public class RoomPostMedunna {
    /*
    {
         "description": "string",

            "price": 0,
            "roomNumber": 0,
            "roomType": "TWIN",
            "status": true
    }

     */

    public RoomPostMedunna() {
    }

    private String description;
    private  int price;
    private int roomNumber;
    private String roomType;
    private  boolean status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomPostMedunna(String description, int price, int roomNumber, String roomType, boolean status) {
        this.description = description;
        this.price = price;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
    }

    public RoomPostMedunna(String description) {
        this.description = description;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
