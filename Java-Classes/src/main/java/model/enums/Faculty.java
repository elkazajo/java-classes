package model.enums;

public enum Faculty {
    PSYCHOLOGY("Psychology"),
    IT("Computer Science"),
    FILM("Film Production"),
    FINANCE("Finance"),
    NONINDB("Not in DB");


    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}
