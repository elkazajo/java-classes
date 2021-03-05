package model.enums;

public enum Year {
    FIRST("First-year"),
    SECOND("Second-year"),
    THIRD("Third-year"),
    FOURTH("Fourth-year");

    String yearNumber;

    Year(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    public String getYearNumber() {
        return yearNumber;
    }
}
