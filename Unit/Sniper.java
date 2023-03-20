package Unit;
public class Sniper extends Archer {

    // Снайпер
    // public Sniper(String name, int attack, int defense, int damage_min, int damage_max, float hp, float hp_max,
    //         int speed, int x, int y, int teams, int shots) {
    //     super(name, attack, defense, damage_min, damage_max, hp, hp_max, speed, x, y, teams, shots);
    // }
    public Sniper(String name, Vector2D coords) {
        super(name, 12, 10, 8, 10, 15, 15,
                9, coords.x, coords.y, 1, 32);
    }        
    
    public String getInfo() {
        return String.format("%s    ; Team:%d; %s; speed:%d; hp:%.0f; shots:%d; state:%s; x:%d; y:%d",
    this.getClass().getSimpleName(), teams, this.name, speed, hp, shots, state, coords.x, coords.y);
}
// @Override
// public StringBuilder getInfo() {
//     StringBuilder builder = new StringBuilder();
//     return builder.append("Снайпер:\t").append(Sniper.super.name)
//             .append("\t| ATK:\t").append(Sniper.super.attack)
//             .append("\t| HP:\t").append(Sniper.super.hp)
//             .append(" \t| Arrows:").append(Sniper.super.shots)
//             .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.x).append(".").append(Sniper.super.coords.y);
// }






}

