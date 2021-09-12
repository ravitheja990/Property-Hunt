package PropertyHunt.DSP;

import PropertyHunt.Controller.pojo.Property;
import PropertyHunt.Database.Database;

import java.util.Map;

public class PropertyDsp {
    public Property getProperty(String propertyId) {
        return Database.getPropertyMap().get(propertyId);
    }
    public void addProperty(Property property) {
        Database.getPropertyMap().put(property.getPropertyId(), property);
    }
    public Map<String, Property> getPropertyMap() {
        return Database.getPropertyMap();
    }

}
