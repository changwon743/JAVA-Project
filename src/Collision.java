public class Collision{
 public static boolean check(Player p,Zombie z){
  return p.x<z.x+30 && p.x+32>z.x &&
         p.y<z.y+30 && p.y+32>z.y;
 }}