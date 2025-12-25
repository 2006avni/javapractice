import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FlappyBird extends JPanel implements ActionListener, KeyListener 
{

    private int birdY = 300; // Bird's Y position
    private int velocity = 0; // Bird's velocity (gravity + flap)
    private boolean gameOver = false;

    private ArrayList<Rectangle> pipes; // List of pipes
    private Timer timer;
    private int score = 0; // Score variable
    private boolean passedPipe = false; // Track when the bird passes a pipe
    private JButton restartButton; // Restart button

    public FlappyBird() 
	{
        timer = new Timer(20, this); // Game loop timer (repeats every 20ms)
        pipes = new ArrayList<>();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        timer.start();
        spawnPipes(); // Create the initial pipes

        // Create restart button (initially hidden)
        restartButton = new JButton("Restart");
        restartButton.setBounds(350, 350, 100, 50);
        restartButton.setVisible(false);
        restartButton.addActionListener(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
			{
                restartGame(); // Call the restart method when clicked
                requestFocusInWindow(); // Make sure the panel regains focus
            }
        });
        this.setLayout(null);
        this.add(restartButton);
    }

    public void spawnPipes() 
	{
        int gap = 150;
        int pipeWidth = 80;
        int pipeHeight = (int) (Math.random() * 300 + 100); // Random height for upper pipe
        pipes.add(new Rectangle(500, 0, pipeWidth, pipeHeight)); // Upper pipe
        pipes.add(new Rectangle(500, pipeHeight + gap, pipeWidth, 600 - pipeHeight - gap)); // Lower pipe
    }

    @Override
    public void paint(Graphics g) 
	{
        super.paint(g);

        // Set background color
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 800, 600);

        // Draw bird
        g.setColor(Color.RED);
        g.fillOval(100, birdY, 20, 20);

        // Draw pipes
        g.setColor(Color.GREEN);
        for (Rectangle pipe : pipes) 
		{
            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
        }

        // Draw score
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Score: " + score, 20, 50);

        // Show game over text and final score, and restart button
        if (gameOver) 
		{
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Game Over!", 250, 300);
            g.setFont(new Font("Arial", Font.BOLD, 30)); // Change font size for score
            g.drawString("Final Score: " + score, 250, 350); // Display final score
            restartButton.setVisible(true); // Show restart button when the game is over
        }
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (!gameOver) 
		{
            // Gravity: Bird falls
            velocity += 1;
            birdY += velocity;

            // Pipe movement
            for (int i = 0; i < pipes.size(); i++) 
			{
                Rectangle pipe = pipes.get(i);
                pipe.x -= 5; // Pipes move left
            }

            // Spawn new pipes when the previous ones go off screen
            if (pipes.get(0).x < -80) 
			{
                pipes.remove(0);
                pipes.remove(0);
                spawnPipes();
            }

            // Check for collisions with pipes or ground
            if (birdY > 600 || birdY < 0) 
			{
                gameOver = true;
                timer.stop();
            }

            for (Rectangle pipe : pipes) 
			{
                if (pipe.intersects(new Rectangle(100, birdY, 20, 20))) {
                    gameOver = true;
                    timer.stop();
                }
            }

            // Increase score when the bird passes a pipe
            Rectangle pipe = pipes.get(0); // Get the front pipe
            if (pipe.x + pipe.width < 100 && !passedPipe) 
			{
                score++;
                passedPipe = true; // Avoid multiple scoring for the same pipe
            }

            // Reset passedPipe when the bird approaches the next pipe
            if (pipe.x + pipe.width > 100) 
			{
                passedPipe = false;
            }

            repaint();
        }
    }

    public void keyPressed(KeyEvent e) 
	{
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) 
		{
            // Flap
            velocity = -10;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // Method to restart the game
    public void restartGame() 
	{
        birdY = 300; // Reset bird position
        velocity = 0; // Reset velocity
        score = 0; // Reset score
        pipes.clear(); // Clear old pipes
        passedPipe = false; // Reset pipe passed flag
        gameOver = false; // Reset game over state
        restartButton.setVisible(false); // Hide restart button
        spawnPipes(); // Spawn initial pipes again
        timer.start(); // Restart the timer
    }

    public static void main(String[] args) 
	{
        JFrame frame = new JFrame();
        FlappyBird game = new FlappyBird();

        frame.setTitle("Flappy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(game);
        frame.setVisible(true);
    }
}