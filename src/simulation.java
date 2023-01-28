import java.util.Scanner;
public class simulation {
    String location;
    int days;
    double wind;
    String windDirection;
    final double MIN_VALUE = 3.0;
    public simulation(String location, int days, double wind){
     this.location =  location;
     this.days = days;
     this.wind = MIN_VALUE;
    }
    public void creation(){
        System.out.println("Please create your vessel.");
        Scanner imp = new Scanner(System.in);
        String fx = imp.nextLine();
        int guh = imp.nextInt();
        for(int i=0;i>6;i++){
            SailShip greatJourney = new SailShip();
            imp.next();
        }
    }
    public void simulationStart(){
        boolean start = true;
        while (start){
            creation();
            randomWindDirection();
        }
    }
    //methods
    public void randomWindDirection(){
        int randNumber = (int)(Math.random()*4)+1; // haha, ik math.random sucks but i don't know any other form of randomization
            switch(randNumber){
                case 1:
                    windDirection = "North";
                    break;
                case 2:
                    windDirection = "South";
                    break;
                case 3:
                    windDirection = "East";
                    break;
                case 4:
                    windDirection = "West";
                    break;
            }
        }
        public void windIncrease(int amount){
            wind +=amount;
        }
        
    }
