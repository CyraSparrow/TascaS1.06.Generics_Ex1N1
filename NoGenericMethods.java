public class NoGenericMethods {
    private String objecte1;
    private String objecte2;
    private String objecte3;

    public NoGenericMethods(String objecte1, String objecte2, String objecte3) {
        this.objecte1 = objecte1;
        this.objecte2 = objecte2;
        this.objecte3 = objecte3;
    }

    public void addObjecte1(String objecte1) {
        this.objecte1 = objecte1;
    }

    public void addObjecte2(String objecte2) {
        this.objecte2 = objecte2;
    }

    public void addObjecte3(String objecte3) {
        this.objecte3 = objecte3;
    }

    public String getObjecte1() {
        return objecte1;
    }

    public String getObjecte2() {
        return objecte2;
    }

    public String getObjecte3() {
        return objecte3;
    }
}

