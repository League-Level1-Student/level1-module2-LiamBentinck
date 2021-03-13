package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature("patrick");
	patrick.eat();
	patrick.laugh();
	patrick.getName();
	SeaCreature squidward = new SeaCreature("squidward");
	squidward.eat();
	squidward.laugh();
	squidward.getName();
}
}
