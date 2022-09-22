public interface Animal {
        public static void Sounds(){

        }
        class Cat implements Animal {
            public void sounds(){
                System.out.println("Cat says Meow Meow");
            }
        }
        class Dog implements Animal {
            public void Sounds(){
                System.out.println("Dog says Woufff Wouuf");
            }
        }

        class  Cow implements Animal {
            public void Sounds(){
                System.out.println("Cow says Moooo Moooo");
            }
               public static void main(String[] args) {
                   Cat ct = new Cat();
                   Dog dg = new Dog();
                   Cow cw = new Cow();
                   ct.sounds();
                   dg.Sounds();
                   cw.Sounds();


               }
           }


        }



