package bug_5;

public class NullPointerException {
    public static void main(String[] args) {
        CustomList[] customLists = new CustomList[5];
        customLists[0].name = "newName";
    }
}

class CustomList {
    public String name;
    public String value;

    public CustomList() {
    }
}

