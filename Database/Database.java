package PropertyHunt.Database;

import PropertyHunt.Controller.pojo.Property;
import PropertyHunt.Controller.pojo.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Database {
    private static Map<String, User> userMap;
    private static Map<String, Property> propertyMap;

    public static Map<String, User> getUserMap() {
        if(Objects.isNull(userMap)) {
            userMap = new HashMap<>();
        }
        return userMap;
    }

    public static Map<String, Property> getPropertyMap() {
        if(Objects.isNull(propertyMap)) {
            propertyMap = new HashMap<>();
        }
        return propertyMap;
    }
}
