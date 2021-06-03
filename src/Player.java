public class Player {
        private String surname;
        private String name;
        private String address;
        private int cartNumber;

        public Player(String surname, String name, String address, int cartNumber){

            this.surname = surname;
            this.name = name;
            this.address = address;
            this.cartNumber = cartNumber;

        }
        public String toString(){
            return "{Player:"
                    +surname +  name
                    +",address:" + address
                    +",card:" + cartNumber
                    +"}";

        }
}

