import java.util.*;
public class SpawnManager{
 Random r=new Random(); int t=0;
 public void spawn(ArrayList<Zombie> z){
  t++;
  if(t>60){
   z.add(new Zombie(r.nextInt(900),r.nextInt(600)));
   t=0;
  }}
}