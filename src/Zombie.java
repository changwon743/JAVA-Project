import java.awt.*;
public class Zombie{
 int x,y; int speed=__ZOMBIE_SPEED__;
 int hp=3; int size=30;
 public Zombie(int x,int y){this.x=x;this.y=y;}
 public void update(Player p){
  if(p.x>x)x+=speed;
  if(p.x<x)x-=speed;
  if(p.y>y)y+=speed;
  if(p.y<y)y-=speed;
 }
 public void draw(Graphics g){
  g.setColor(__ZOMBIE_COLOR__);
  g.fillRect(x,y,size,size);
 }}