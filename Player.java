class Player
{
    private String name;
    private int guess = 0;

    void playerDetails(String a, int b){
        name = a;
        guess = b;
    }

    void show(){
        System.out.println("Name is "+name);
        System.out.println("Guess is "+guess);
    }
}