package javase02.t05;

public enum Subjects {
    LITERATURE("double"), HISTORY("double"), RELIGION("double"),
    GEOGRAPHY("double"), ARTS("double"),
    PSYCHOLOGY("integer"), ENGLISH("integer"), ECONOMICS("integer"),
    BUSINESS("integer"), DIVINITY("integer"), HEALTH("integer");

    private String code;
    Subjects(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
