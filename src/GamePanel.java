import javax.swing.*; import java.awt.*; import java.util.*;
public class GamePanel extends JPanel implements Runnable{
 Thread t; KeyHandler k=new KeyHandler();
 Player p=new Player(400,300);
 ArrayList<Zombie> z=new ArrayList<>();
 SpawnManager s=new SpawnManager();
 BulletManager b=new BulletManager();
 int day=0;
 public GamePanel(){
  this.setBackground(__BACKGROUND_COLOR__);
  this.setFocusable(true);
  this.addKeyListener(k);
 }
 public void startGameThread(){t=new Thread(this);t.start();}
 public void run(){
  while(t!=null){
   update(); repaint();
   try{Thread.sleep(16);}catch(Exception e){}
  }}
 public void update(){
  p.update(k);
  b.update();
  s.spawn(z);
  for(Zombie zz:z){
   zz.update(p);
   if(Collision.check(p,zz)) p.hp--;
   if(b.hit(zz)) zz.hp--;
  }
  z.removeIf(zz->zz.hp<=0);
  if(k.attack) b.fire(p.x,p.y);
  day++; if(day>__DAY_LENGTH__) day=0;
 }
 public void paintComponent(Graphics g){
  super.paintComponent(g);
  p.draw(g);
  for(Zombie zz:z) zz.draw(g);
  b.draw(g);
  g.setColor(Color.white);
  g.drawString("HP:"+p.hp,20,20);
 }}