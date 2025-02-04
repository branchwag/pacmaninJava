import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowCount = 21;
    private int columnCount = 19;
    private int tileSize = 32;
    private int boardWidth = columnCount * tileSize;
    private int boardHeight = rowCount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        //load images
        wallImage = new ImageIcon(getClass().getResource("./imgs/wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./imgs/blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./imgs/orangeGhost.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./imgs/blueGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./imgs/pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./imgs/redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./imgs/pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./imgs/pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./imgs/pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./imgs/pacmanRight.png")).getImage();
        
    }

    
}
