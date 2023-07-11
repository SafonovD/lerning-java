package lesson_5;

import lesson_5.Forest.Squirel;
import lesson_5.Forest.Tree;

public class ForestMain {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.setHeight(28);
        tree.setAge(100);
        tree.getInfo();

        Squirel squirel = new Squirel();
        squirel.setColor("red");
        squirel.setAge(2);
        squirel.getInfo();
    }
}
