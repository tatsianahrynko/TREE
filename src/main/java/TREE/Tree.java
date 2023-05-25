package TREE;

import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;  //non-static attributes
    protected static Color TRUNK_COLOR = new Color(102,51,0);//static attribute/ class attribute

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

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

    public void grow(){
        //implementation
        this.heightFt = this.heightFt + 10;
        //increment them accordingly
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

    //able to define attributes and behaviors that are reusable. able to bind state and behavior into 1 unit.
    public void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's tall " + this.treeType + " tree!");
        }
    }
}

