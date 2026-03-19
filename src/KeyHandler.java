import java.awt.event.*;
public class KeyHandler implements KeyListener{
 public boolean up,down,left,right,attack;
 public void keyPressed(KeyEvent e){
  int c=e.getKeyCode();
  if(c==KeyEvent.VK_W)up=true;
  if(c==KeyEvent.VK_S)down=true;
  if(c==KeyEvent.VK_A)left=true;
  if(c==KeyEvent.VK_D)right=true;
  if(c==KeyEvent.VK_SPACE)attack=true;
 }
 public void keyReleased(KeyEvent e){
  int c=e.getKeyCode();
  if(c==KeyEvent.VK_W)up=false;
  if(c==KeyEvent.VK_S)down=false;
  if(c==KeyEvent.VK_A)left=false;
  if(c==KeyEvent.VK_D)right=false;
  if(c==KeyEvent.VK_SPACE)attack=false;
 }
 public void keyTyped(KeyEvent e){}
}