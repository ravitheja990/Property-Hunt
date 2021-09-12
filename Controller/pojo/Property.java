package PropertyHunt.Controller.pojo;

import java.util.List;

public class Property {
    private String propertyId;
    private String propertyLocation;
    private Long propertyPrice;
    private String propertyListingType;
    private Long propertySize;
    private Integer numberOfFloors;
    private List<Integer> propertyNumberOfRooms;
    private String propertyStatus;
    private String propertyListedBy;
    private String propertyShortListedBy;

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public Long getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(Long propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getPropertyListingType() {
        return propertyListingType;
    }

    public void setPropertyListingType(String propertyListingType) {
        this.propertyListingType = propertyListingType;
    }

    public Long getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Long propertySize) {
        this.propertySize = propertySize;
    }

    public List<Integer> getPropertyNumberOfRooms() {
        return propertyNumberOfRooms;
    }

    public void setPropertyNumberOfRooms(List<Integer> propertyNumberOfRooms) {
        this.propertyNumberOfRooms = propertyNumberOfRooms;
    }

    public String getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public String getPropertyListedBy() {
        return propertyListedBy;
    }

    public void setPropertyListedBy(String propertyListedBy) {
        this.propertyListedBy = propertyListedBy;
    }

    public String getPropertyShortListedBy() {
        return propertyShortListedBy;
    }

    public void setPropertyShortListedBy(String propertyShortListedBy) {
        this.propertyShortListedBy = propertyShortListedBy;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyLocation='" + propertyLocation + '\'' +
                ", propertyPrice=" + propertyPrice +
                ", propertyListingType='" + propertyListingType + '\'' +
                ", propertySize=" + propertySize +
                ", numberOfFloors=" + numberOfFloors +
                ", propertyNumberOfRooms=" + propertyNumberOfRooms +
                ", propertyStatus='" + propertyStatus + '\'' +
                ", propertyListedBy='" + propertyListedBy + '\'' +
                ", propertyShortListedBy='" + propertyShortListedBy + '\'' +
                '}';
    }
}
