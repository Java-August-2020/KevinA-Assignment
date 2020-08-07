public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getHealth());
        human.showAttack();


        Human human2 = new Human(3, 3, 3, 100);
        System.out.println(human2.getHealth());
        human2.showAttack();

    }
}
