package com.charlieperson;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//        player.name = "chuck";
//        player.health = 20;
//        player.weapon = "knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Chuck", 100, "Whip");
        enhancedPlayer.loseHealth(50);
        System.out.println(enhancedPlayer.getHealth());
    }
}
