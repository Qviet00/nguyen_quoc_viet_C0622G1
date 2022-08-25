package Case_Study.models;

public abstract class ManagementSystem {
    private String name;
    private String birthDay;
    private String grand;
    private double numberCard;
    private String numberPhone;
    private String email;

    public ManagementSystem() {
    }

    public ManagementSystem(String name, String birthDay, String grand,
                            double numberCard, String numberPhone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.grand = grand;
        this.numberCard = numberCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    public double getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(double numberCard) {
        this.numberCard = numberCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",getName(),getBirthDay(),getGrand(),
                getNumberCard(),getNumberPhone(),getEmail());
    }
}
