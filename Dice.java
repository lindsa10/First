class Dice
{
    private int numOfSides = 6;
    private int answer = 0;

    int roll(){
        Random rand = new Random();
        int my_rand = rand.nextInt(numOfSides);
        answer = my_rand;

        return answer;
    }

    void show1(){
        System.out.println("Computer's choice was: "+answer);
    }
}