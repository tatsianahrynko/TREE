package TREE;

import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;  //CREATED ATTRIBUTES FOR A CLASS. NON-STATIC ATTRIBUTES
    protected static Color TRUNK_COLOR = new Color(102,51,0);//static attribute/ class attribute

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    } // constructor will create a tree

    public double getHeightFt() {
        return heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public static Color getTrunkColor() {
        return TRUNK_COLOR;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public static void setTrunkColor(Color trunkColor) {
        TRUNK_COLOR = trunkColor;
    }

    public void grow(){ //behavior выразили функцией
        this.heightFt = this.heightFt + 10;  //implementation
        this.trunkDiameterInches = this.trunkDiameterInches + 1; //increment them accordingly
    }

    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    public void announceTallTree() { //able to define attributes and behaviors that are reusable. able to bind state and behavior into 1 unit. proram becomes
        if (this.heightFt > 100) {
            System.out.println("That's tall " + this.treeType + " tree!");
        }
    }
}

