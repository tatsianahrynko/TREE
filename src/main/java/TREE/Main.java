package TREE;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(125, 5, TreeType.OAK);

        System.out.println(myFavoriteOakTree.getTreeType());
        myFavoriteOakTree.announceTallTree(); // added new behavior

        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        myFavoriteMapleTree.announceTallTree(); //NON-STATIC METHOD/ instance.method

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        Color myDefaultBlue = Color.BLUE;

        Color brighterBlue = myDefaultBlue.brighter();

        brighterBlue.brighter();

        System.out.println(Tree.TRUNK_COLOR); //className.method
        Tree.announceTree();// static method

        if (myFavoriteOakTree.getHeightFt() > 100) {
            System.out.println("That's tall " + myFavoriteOakTree.getTreeType() + " tree!");
        }

        if (myFavoriteMapleTree.getHeightFt() < 100) {
            System.out.println("That's tall " + myFavoriteMapleTree.getTreeType() + " tree!");
        }
    }
}
