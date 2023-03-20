package Unit;

public class Wizard extends Mag{

    // Колдун

    public Wizard(String name, Vector2D coords) {
        super(name, 17, 12, -5, -5, 30, 30, 9, coords.x, coords.y, 1, 1, 1);
    }
    public String getInfo() {
        return String.format("%s    ; Team:%d; %s; speed:%d; hp:%.0f; mana :%.0f;  state:%s; x:%d; y:%d",
        this.getClass().getSimpleName(), teams, this.name, speed, hp, mana, state, coords.x, coords.y);
   }

// @Override
//     public StringBuilder getInfo() {
//         StringBuilder builder = new StringBuilder();
//         return builder.append("Колдун: \t").append(Wizard.super.name)
//                 .append("\t| ATK:\t").append(Wizard.super.attack)
//                 .append("\t| HP:\t").append(Wizard.super.hp)
//                 .append(" \t| MP:\t").append(Wizard.super.mana)
//                 .append("\t|").append("\t| (X.Y) : ").append(Wizard.super.coords.x).append(".").append(Wizard.super.coords.y);
//     }

}