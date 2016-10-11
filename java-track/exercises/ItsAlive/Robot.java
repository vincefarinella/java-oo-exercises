package ItsAlive;

public class Robot {
	
	private String name;
	private Integer positionX;
	private Integer positionY;
	private Integer speed;
	private String direction;
	
	public Robot(String name, Integer positionX, Integer positionY, Integer speed, String direction){
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.direction = direction;
	}
	public String getName(){
		return this.name;		
	}
	public Integer getPositionX(){
		return this.positionX;
	}
	public Integer getPositionY(){
		return this.positionY;
	}
	public Integer getSpeed(){
		return this.speed;
	}
	public String getDirection(){
		return this.direction;
	}
	
	public void setNewPositionX(Integer NewPositionX){
		this.positionX = this.positionX + NewPositionX; 
	}
	public void setNewPositionY(Integer NewPositionY){
		this.positionY = this.positionY + NewPositionY;
	}	
	public void setNewDirection(String NewDirection){
		this.direction = NewDirection;
	}
	public void getDistance(Integer Rp2x, Integer Rp2y){
		 
	}
	public String toString(){
		return "Name:" + this.name + " Position:("+this.positionX+","+this.positionY+")" + " Speed:" + this.speed + " Direction:" +this.direction;
				
	}
	
	public static void main(String[] args) {
		Robot myRobot = new Robot("vince",1,2,25,"north");
		System.out.println(myRobot);
		Robot theirRobot = new Robot("brittany",3,4,100,"south");
		myRobot.setNewDirection("West");
		System.out.println(myRobot.getDirection());

	}

}
