import org.cschallenge.pinball.engine.Heading;
import org.cschallenge.pinball.engine.ITower;
import org.cschallenge.pinball.engine.PinballEngine.TeamType;
import org.cschallenge.pinball.engine.Position;
import org.cschallenge.pinball.engine.TowerPosition;

public class MyTower implements ITower {

	int x;
	int y;
	int expires;
	
	public MyTower(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public TowerPosition initialize(int turn) {
		return new TowerPosition(x, y, 1);
	}

	public Heading onCaptureBall(TeamType teamType, Heading heading) {
		return teamType == TeamType.FRIEND ? Heading.WEST : Heading.EAST;
	}

	public boolean extinguish(int turn) {
		return false;
	}

	public void onDetectBall(TeamType teamType, Position position) {
		// TODO Auto-generated method stub	
	}
	
	public int getDetectionRadius() {
		return 5;
	}
}