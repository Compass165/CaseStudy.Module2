package model;

public class ArmorLunisolar extends LunisolarTools{ //giáp

    private int HP; //Máu
    private int magicalResistance; //Kháng phép

    public ArmorLunisolar () {
    }

    public ArmorLunisolar(String toolsID, String name, String classes, int price, int soulPower, String note) {
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

    public ArmorLunisolar(String toolsID, String name, String classes, int price, int soulPower, String note, int HP, int magicalResistance) {
        super(toolsID, name, classes, price, soulPower, note);
        this.HP = HP;
        this.magicalResistance = magicalResistance;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public void setMagicalResistance(int magicalResistance) {
        this.magicalResistance = magicalResistance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Giáp âm dương: " +
                "Máu=" + HP +
                ", Kháng phép=" + magicalResistance +
                '}';
    }
}
