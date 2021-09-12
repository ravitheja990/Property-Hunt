package PropertyHunt.Service;

import PropertyHunt.Controller.pojo.Property;
import PropertyHunt.Controller.pojo.User;
import PropertyHunt.DSP.PropertyDsp;
import PropertyHunt.DSP.UserDsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PropertyHuntService {
    private UserDsp userDsp;
    private PropertyDsp propertyDsp;

    public PropertyHuntService(UserDsp userDsp, PropertyDsp propertyDsp) {
        this.userDsp = userDsp;
        this.propertyDsp = propertyDsp;
    }
    public void registerUser(User user) {
        this.userDsp.registerUser(user);
    }
    public boolean userExists(String userId) {
        return this.userDsp.getUser(userId) != null;
    }
    public User getUser(String userId) {
        if(userExists(userId)) {
            return this.userDsp.getUser(userId);
        }
        return null;
    }
    public void listProperty(Property property) {
        this.propertyDsp.addProperty(property);
    }
    public boolean propertyExists(String propertyId) {
        return this.propertyDsp.getProperty(propertyId) != null;
    }
    public Property getProperty(String propertyId) {
        if(propertyExists(propertyId)) {
            return this.propertyDsp.getProperty(propertyId);
        }
        return null;
    }
    public List<Property> getShortListedProperties(String userId) {
        Map<String, Property> propertyMap = this.propertyDsp.getPropertyMap();
        Iterator<Map.Entry<String, Property>> iterator = propertyMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Property> property = iterator.next();
            if(!userId.equals(property.getValue().getPropertyShortListedBy())) {
                iterator.remove();
            }
        }
        List<Property> shortListedPropertiesList = new ArrayList<>();
        for(String propertyId: propertyMap.keySet()) {
            shortListedPropertiesList.add(propertyMap.get(propertyId));
        }
        return shortListedPropertiesList;
    }

}
