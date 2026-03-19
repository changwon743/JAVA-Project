import java.awt.*;
public class Player{
 int x,y; int speed=__PLAYER_SPEED__;
 int hp=100; int size=32;
 public Player(int x,int y){this.x=x;this.y=y;}
 public void update(KeyHandler k){
  if(k.up)y-=speed;
  if(k.down)y+=speed;
  if(k.left)x-=speed;
  if(k.right)x+=speed;
 }
 public void draw(Graphics g){
  g.setColor(__PLAYER_COLOR__);
  g.fillRect(x,y,size,size);
 }}