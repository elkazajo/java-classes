package model.enums;

public enum Group {
    A("Group A"),
    B("Group B"),
    C("Group C");

    String groupName;

    Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
