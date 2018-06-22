/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author Martim
 */
public class Tile {
	    private Tile north, south, east, west, up, down;
        private int health;
        private boolean isPassable;
        private int coverType;      //1 = half cover, 2 = full cover
        private String type;
        //TODO add texture
        public Tile(int health, boolean isPassable, int coverType, String type) {
            this.health = health;
            this.isPassable = isPassable;
            this.coverType = coverType;
            this.type = type;
        }
        //==========================================================================
        //--------------------------------------------------------------------------
        //Set methods
        public void north(Tile north) {this.north = north;}
        public void south(Tile south) {this.south = south;}
        public void east(Tile east) {this.east = east;}
        public void west(Tile west) {this.west = west;}
        public void up(Tile up) {this.up = up;}
        public void down(Tile down) {this.down = down;}
        public void health(int health) {this.health = health;}
        public void isPassable(boolean isPassable) {this.isPassable = isPassable;}
        public void coverType(int coverType) {this.coverType = coverType;}
        public void type(String type) {this.type = type;}
        //==========================================================================
        //--------------------------------------------------------------------------
        //Get methods
        public Tile north() {return this.north;}
        public Tile south() {return this.south;}
        public Tile east() {return this.east;}
        public Tile west() {return this.west;}
        public Tile up() {return this.up;}
        public Tile down() {return this.down;}
        public int health() {return this.health;}
        public boolean isPassable() {return this.isPassable;}
        public int coverType() {return this.coverType;}
        public String type() {return this.type;}
        
}
