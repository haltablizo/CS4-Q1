
package ex06_gra_tablizohl;

public class FireType extends SimpleMonster {
    
    public FireType(String n, String t, String s, String w, int m, int base) {
        super("charmander", t, s, w, m, base);
    }
    
}

        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);

FireType: a Monster that has a type "fire", strong against "grass", weak against "water", and whose atk is 1.3 times the base value and def is 0.7 times the base value. The special of FireTypes increase their atk by 2 points at the cost of reducing their HP by 10% of their maxHP.

GrassType: a Monster that has a type "grass", strong against "water", weak against "fire", and whose atk and def is equal to the base value. The rest() of GrassTypes heal by half the maxHP. The special of GrassTypes raise their health by 20% of the maxHP.

WaterType: a Monster that has a type "water", strong against "fire", weak against "grass", and whose atk is 0.7 times the base value and def is 1.3 times the base value. The special of WaterTypes increase their def by 2 points at the cost of reducing their HP by 10% of their maxHP.

