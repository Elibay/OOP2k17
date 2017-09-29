package Problem5;


public class Main {
	
	public static Figures[][] u = new Figures[10][10];
	public static String wqueen = "♕";
	public static String wking = "♔";
	public static String wrook = "♖";
	public static String wknight = "♘";
	public static String welephant = "♗";
	public static String wpawn = "♙";
	
	public static String bqueen = "♛";
	public static String bking = "♚";
	public static String brook = "♜";
	public static String bknight = "♞";
	public static String belephant = "♝";
	public static String bpawn = "♟";	
	
	static void addQK () {
		Figures f = new Queen(new Position (1, 'd'), 'w', wqueen);
		u[1][4] = f;
		f = new Queen(new Position (8, 'd'), 'b', bqueen);
		u[8][4] = f;
		
		f = new Queen(new Position (1, 'e'), 'w', wking);
		u[1][5] = f;
		f = new Queen(new Position (8, 'e'), 'b', bking);
		u[8][5] = f;	
	}
	static void addPK () {
		for (int i = 1; i <= 8; ++ i) {
			Figures f = new Pawn (new Position (2, i), 'w', wpawn);
			u[2][i] = f;
		}
		for (int i = 1; i <= 8; ++ i) {
			Figures f = new Pawn (new Position (7, i), 'b', bpawn);
			u[7][i] = f;
		}
		Figures f = new Knight(new Position (1, 'b'), 'w', wknight);
		u[1][2] = f;
		f = new Knight(new Position (1, 'g'), 'w', wknight);
		u[1][7] = f;

		f = new Knight(new Position (8, 'b'), 'b', bknight);
		u[8][2] = f;
		f = new Knight(new Position (8, 'g'), 'b', bknight);
		u[8][7] = f;
	}
	static void addRE () {
		Figures f = new Elephant(new Position (1, 6), 'w', welephant);
		u[1][6] = f;
		f = new Elephant(new Position (1, 3), 'w', welephant);
		u[1][3] = f;
		f = new Elephant(new Position (8, 6), 'b', belephant);
		u[8][3] = f;
		f = new Elephant(new Position (8, 3), 'b', belephant);
		u[8][6] = f;
		
		f = new Rook(new Position (1, 8), 'w', wrook);
		u[1][8] = f;
		f = new Rook(new Position (1, 1), 'w', wrook);
		u[1][1] = f;
		
		f = new Rook(new Position (8, 1), 'b', brook);
		u[8][1] = f;
		f = new Rook(new Position (8, 8), 'b', brook);
		u[8][8] = f;
		
	}
}
