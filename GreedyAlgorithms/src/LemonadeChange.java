public class LemonadeChange {

    /*
    Problem statement - We have to sell cookies with cost of 5 for each cookie ,customer stand in queue to buy these cookies, and each customer can buy one cookie at a time they can pay the bill of the cookie in the coin of 5 , 10, 20,We have to give change to the customer according their bill and paid coin
                        Now we have to find that each customer get change properly or not, we have to assume that initially we don't have any coin
     */

    public static boolean canGetChange(int[] bills){

        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){ // if bill is 5 then we don't need to give change
                five++; // increase 5 coin count
            }else if(bill == 10){ // if bill equal to 10 we have to give back 5 coin
                if(five > 0){
                    five--; // decrease five count on giving change
                    ten++; // increase ten coin count
                }else{ // if we don't have enough 5 coin return false here
                    return false;
                }
            }else{ // if customer pay 20 coin
                if(ten > 0 && five > 0){ // on the return of 20 coin we have to give change 15 to customer so we need at least one 10 coin with one 5 coin
                    ten--;
                    five--; // decrease both coin by one
                }else if(five >= 3){ // for 15 change we can also give three 5 coin
                    five -= 3; // decrease five coin by 3 times
                }else{
                    return false;
                }
            }
        }

        return true; // all customer get their change
    }

    public static void main(String[] args) {
        int[] bill1 = {5,5,5,10,20};
        int[] bill2 = {5,5,10,10,20};

        System.out.println(canGetChange(bill1));
        System.out.println(canGetChange(bill2));
    }
}
