package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// US_010 msk
@JsonIgnoreProperties(ignoreUnknown = true)
public class DrAppointmentsPojo {
    private int id;
    private String startDate;
    private String endDate;
    private String status;

    public DrAppointmentsPojo() {
    }

    public DrAppointmentsPojo(int id, String startDate, String endDate, String status) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DrAppointmentsPojo{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
