import java.awt.*; import java.util.*;
class Bullet{int x,y,spd=8;}
public class BulletManager{
 ArrayList<Bullet> list=new ArrayList<>();
 public void fire(int x,int y){
  Bullet b=new Bullet(); b.x=x; b.y=y;
  list.add(b);
 }
 public void update(){
  for(Bullet b:list) b.y-=b.spd;
 }
 public boolean hit(Zombie z){
  for(Bullet b:list){
   if(b.x<z.x+30 && b.x+5>z.x && b.y<z.y+30 && b.y+5>z.y){
    return true;
   }}
  return false;
 }
 public void draw(Graphics g){
  g.setColor(Color.YELLOW);
  for(Bullet b:list) g.fillRect(b.x,b.y,5,5);
 }}