package PropertyHunt.Controller;

import PropertyHunt.Controller.pojo.Property;
import PropertyHunt.Controller.pojo.User;
import PropertyHunt.DSP.PropertyDsp;
import PropertyHunt.DSP.UserDsp;
import PropertyHunt.Service.PropertyHuntService;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyHuntController {
    
    public static void main(String[] args) {
        UserDsp userDsp = new UserDsp();
        PropertyDsp propertyDsp = new PropertyDsp();
        PropertyHuntService propertyHuntService = new PropertyHuntService(userDsp, propertyDsp);
        User user = new User();
        user.setUserId("sampleUserId");
        user.setUserName("Ravi");
        user.setUserVerificationId("1234");
        user.setUserVerificationIdType("AADHAAR");
        user.setUserPhoneNumber("9911882211");
        user.setUserEmailId("ravi@gmail.com");
        user.setUserLocation("hyderabad");
        propertyHuntService.registerUser(user);
        Property property = new Property();
        property.setPropertyId("samplePropertyId");
        property.setPropertyLocation("hyderabad");
        property.setPropertyPrice(10000000l);
        property.setPropertyListingType("LEASE");
        property.setPropertySize(3000l);
        property.setNumberOfFloors(2);
        property.setPropertyNumberOfRooms(new ArrayList<>(Arrays.asList(2, 3)));
        property.setPropertyStatus("AVAILABLE");
        property.setPropertyListedBy("sampleUserId");
        propertyHuntService.listProperty(property);
        propertyHuntService.getProperty(property.getPropertyId()).setPropertyShortListedBy(user.getUserId());
        System.out.println(propertyHuntService.getShortListedProperties(user.getUserId()));
    }
}
