public class Animal {
    public void AnimalSound(){
        System.out.println("the animal make a sound");
    }
}

class pig extends Animal{
    public void AnimalSound(){
        System.out.println("pig: sound wip wip");
    }

        }

        class dog extends Animal{
    public void AnimalSound(){
        System.out.println("dog: bow bow");
    }
        }
        class main {
            public static void main(String[] args) {
                Animal  MyAnimal = new Animal();
                Animal MyPig = new pig();
                Animal MyDog = new dog();
                MyAnimal.AnimalSound();
                MyPig.AnimalSound();
                MyDog.AnimalSound();
            }
        }
