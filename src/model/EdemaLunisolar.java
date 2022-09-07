package model;

public class EdemaLunisolar extends LunisolarTools{ //Phù triền

    private int abilityPower; //Sức mạnh phép thuật
    private String HP; //Máu

    public EdemaLunisolar(){
    }

    public EdemaLunisolar(String toolsID, String name, String classes, int price, int soulPower, String note) {
        super(toolsID, name, classes, price, soulPower, note);
    }

    @Override
    public String classification() {
        if (super.getSoulPower() <= 350) {
            return "Đồ Lởm!";
        } else if (super.getSoulPower() <= 500) {
            return "Made in Chai Lọ!";
        } else if (super.getSoulPower() <= 650) {
            return "Cũng ra gì và này nọ đấy!";
        } else if (super.getSoulPower() <= 1000) {
            return "Xời, tuyệt vời!";
        } else {
            return "U là trời, không phải con người nữa rồi!";
        }
    }

    public EdemaLunisolar(String toolsID, String name, String classes, int price, int soulPower, String note, int abilityPower, String HP) {
        super(toolsID, name, classes, price, soulPower, note);
        this.abilityPower = abilityPower;
        this.HP = HP;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }



    @Override
    public String toString() {
        return toString()+
                "Phù triền sẽ được cộng thêm: " +
                "Sức mạnh phép thuật=" + abilityPower +
                ", Máu=" + HP +
                '}';
    }
}
