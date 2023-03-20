package Unit;
public class Arbalester extends Archer {

// Арбалетчик

    // public Arbalester(String name, int attack, int defense, int damage_min, int damage_max, float hp, float hp_max,
    //         int speed, int x, int y, int teams, int shots) {
    //     super(name, attack, defense, damage_min, damage_max, hp, hp_max, speed, x, y, teams, shots);
    // }
    public Arbalester(String name, Vector2D coords) {
        super(name, 6, 3, 2, 3, 10, 10,
                4, coords.x, coords.y, 2,16);
    }


    @Override
    public String getInfo() {
        return String.format("%s; Team:%d; %s; speed:%d; hp:%.0f; shots:%d; state:%s; x:%d; y:%d",
       this.getClass().getSimpleName(), teams, this.name, speed, hp, shots, state, coords.x, coords.y);
   }
// @Override
// public StringBuilder getInfo() {
//     StringBuilder builder = new StringBuilder();
//     return builder.append("Арбалет: \t").append(Arbalester.super.name)
//             .append("\t| ATK:\t").append(Arbalester.super.attack)
//             .append("\t| HP:\t").append(Arbalester.super.hp)
//             .append(" \t| Arrows:").append(Arbalester.super.shots)
//             .append("\t|").append("\t| (X.Y) : ").append(Arbalester.super.coords.x).append(".").append(Arbalester.super.coords.y);
// }

   
}

