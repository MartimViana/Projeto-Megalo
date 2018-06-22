package graphics;

public class Map {
	private String name;
	private Tile[][][] tileAdjMatrix;
	private int x, y, z;
	public Map(String name, Tile[][][] tileMatrix) {
		this.name = name;
		this.tileAdjMatrix = tileMatrix;
		this.x = tileAdjMatrix.length;
		this.y = tileAdjMatrix[0].length;
		this.z = tileAdjMatrix[0][0].length;
	}
	
	//Get methods
	public String name() {return this.name;}
	public Tile get_Tile(int x, int y, int z) {return tileAdjMatrix[x][y][z];}
	public int get_x() {return this.x;}
	public int get_y() {return this.y;}
	public int get_z() {return this.z;}
}
