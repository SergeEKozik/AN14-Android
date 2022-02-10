package achapovskiy.lab6.person;


import achapovskiy.lab6.person.jacket.IJacket;
import achapovskiy.lab6.person.pants.IPants;
import achapovskiy.lab6.person.shoes.IShoes;


    public class Person implements IPerson {
        private String name;
        private IJacket jacket;
        private IPants pants;
        private IShoes shoes;

        public Person(String name,  IJacket jacket,IPants pants, IShoes shoes) {
            this.name = name;
            this.jacket = jacket;
            this.pants = pants;
            this.shoes = shoes;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public IJacket getJacket() {
            return jacket;
        }

        public void setJacket(IJacket jacket) {
            this.jacket = jacket;
        }

        public IPants getPants() {
            return pants;
        }

        public void setPants(IPants pants) {
            this.pants = pants;
        }

        @Override
        public void getDress() {
            System.out.println(getName() + ":");
            jacket.getDress();
            pants.getDress();
            shoes.getDress();
        }

        /**
         * Get the cost of a robot
         *
         * @return int
         */
        @Override
        public void undress() {
            System.out.println(getName() + " решил:");
            jacket.undress();
            pants.undress();
            shoes.undress();
        }
}
