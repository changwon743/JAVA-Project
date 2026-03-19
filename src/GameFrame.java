import javax.swing.*; 
public class GameFrame extends JFrame{
 public GameFrame(){
  GamePanel p=new GamePanel();
  this.add(p);
  this.setSize(960,640);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setVisible(true);
  p.startGameThread();
 }}