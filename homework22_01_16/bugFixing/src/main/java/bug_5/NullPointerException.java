package bug_5;

public class NullPointerException {
    public static void main(String[] args) {
        CustomList[] customLists = {new CustomList()};
        customLists[0].name = "newName";
        System.out.println(customLists[0].name);
    }
}

class CustomList {
    public String name;
    public String value;

    public CustomList() {
        
    }
}

