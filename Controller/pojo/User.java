package PropertyHunt.Controller.pojo;

public class User {
    private String userId;
    private String userName;
    private String userVerificationId;
    private String userVerificationIdType;
    private String userPhoneNumber;
    private String userEmailId;
    private String userLocation;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserVerificationId() {
        return userVerificationId;
    }

    public void setUserVerificationId(String userVerificationId) {
        this.userVerificationId = userVerificationId;
    }

    public String getUserVerificationIdType() {
        return userVerificationIdType;
    }

    public void setUserVerificationIdType(String userVerificationIdType) {
        this.userVerificationIdType = userVerificationIdType;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userVerificationId='" + userVerificationId + '\'' +
                ", userVerificationIdType='" + userVerificationIdType + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmailId='" + userEmailId + '\'' +
                ", userLocation='" + userLocation + '\'' +
                '}';
    }
}
