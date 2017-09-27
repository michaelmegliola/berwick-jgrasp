import org.cschallenge.pinball.engine.GameLauncher;

import org.cschallenge.pinball.engine.IPlayer;
import org.cschallenge.pinball.engine.ITower;
import org.cschallenge.pinball.engine.PinballEngine.Team;
import org.cschallenge.pinball.engine.PinballEngine.TeamType;
import org.cschallenge.pinball.engine.PinballEngine.TowerQueue;
import org.cschallenge.pinball.engine.PinballEngine.Turn;
import org.cschallenge.pinball.engine.Position;

public class MyPlayer implements IPlayer {

   int x = 3;
   int y = 3;
   
   /*
    * This entry point allows the game to run from a jGRASP session.
    */
   public static void main(String[] args) throws Exception {   
      GameLauncher.main("org.cschallenge.pinball.samples.LeoPlayer.Leo", "org.cschallenge.pinball.samples.teamK.SamplePlayerK");
      //GameLauncher.main("MyPlayer", "org.cschallenge.pinball.samples.teamK.SamplePlayerK");
   }
   
   /*
    * The real code for the player starts here.
    */
	public void init(Team team) {
		// TODO Auto-generated method stub
	}

	public void onExpired(ITower tower) {
		// TODO Auto-generated method stub
	}

	public void startTurn(Turn turn, TowerQueue queue) {
      queue.addTower(new MyTower(x++,y++));
   }
   
	public void onDetectBall(Turn turn, TowerQueue queue, TeamType teamType, Position position) {
		// TODO Auto-generated method stub

	} 
}