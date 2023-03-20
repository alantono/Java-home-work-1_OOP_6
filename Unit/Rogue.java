package Unit;

import java.util.ArrayList;

public class Rogue extends Characters {
    // Разбойник

    // public Rogue(String name, int attack, int defense, int damage_min, int damage_max, float hp, float hp_max,
    //         int speed, int x, int y, int teams) {
    //     super(name, attack, defense, damage_min, damage_max, hp, hp_max, speed, x, y, teams);
    //                                             }
         public Rogue(String name, Vector2D coords) {
            super(name, 8, 3, 2, 4, 10, 10, 6, coords.x, coords.y, 1);
                                                    }
    @Override
    public void step(ArrayList<Characters> teams_1, ArrayList<Characters> teams_2) {
        if (state.equals("Die")) return;
            Characters victim = teams_2.get(findNearest(teams_2));
             if (coords.getDistanсe(victim.coords) < 2) {
                float damage = (victim.defense - attack > 0) ? damage_min : 
                (victim.defense - attack < 0) ? damage_max : 
                (damage_max + damage_min)/2;
                victim.getDamage(damage); // передаем противнику повреждение
            }
             if (coords.getDown(victim.coords)) {
                    if (coords.y - 1 > victim.coords.y && coords.getEmpty(teams_1, coords.x, coords.y - 1)) {
                    stepDown();
                                }
                    else {
                        sidestep(teams_1, victim);
                        }
                } else {
                    if (coords.y + 1 < victim.coords.y && coords.getEmpty(teams_1, coords.x, coords.y + 1)) {
                        stepUp();}
                    else {
                            sidestep(teams_1, victim);
                        } 
                }
             }
             
            
        protected void stepDown() {coords.y -= 1;}
        protected void stepUp() {coords.y += 1;}
        protected void sidestep(ArrayList<Characters> team, Characters victim) {
            if (coords.getLeft(victim.coords)) {
                if (coords.getEmpty(team, coords.x - 1, coords.y)) {
                    coords.x -= 1;
                }
            } else {
                if (coords.getEmpty(team, coords.x + 1, coords.y)) {
                    coords.x += 1;
                }
            }
        }
    public String getInfo() {
        return String.format("%s     ; Team:%d; %s; speed:%d; hp:%.0f;            state:%s; x:%d; y:%d",
       this.getClass().getSimpleName(), teams, this.name, speed, hp, state, this.coords.x, this.coords.y);
                            }
    // @Override
    // public StringBuilder getInfo() {
    //     StringBuilder builder = new StringBuilder();
    //     return builder.append("Бандит: \t").append(Rogue.super.name)
    //             .append("\t| ATK:\t").append(Rogue.super.attack)
    //             .append("\t| HP:\t").append(Rogue.super.hp)
    //             .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rogue.super.coords.x).append(".").append(Rogue.super.coords.y);
    // }
    }
    
   