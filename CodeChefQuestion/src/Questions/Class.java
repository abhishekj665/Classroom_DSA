package Questions;

//Exit Door
//There are
//N
//N people sitting in a single row inside a movie theatre.
//Each person has a unique number from
//1
//        1 to
//        N
//N, representing their priority or importance.
//You are given a permutation
//        P
//1
//        ,
//P
//2
//        ,
//        …
//        ,
//P
//        N
//P
//1
//        ​
//        ,P
//2
//        ​
//        ,…,P
//        N
//​
//where
//        P
//i
//        P
//i
//​
//is the number of the person sitting in the
//        i
//t
//        h
//i
//        th
//seat (from left to right).
//
//After the movie ends, people start leaving the hall one by one — in order of decreasing number (that is, the person with the highest number leaves first, then the next highest, and so on).
//
//When a person leaves, they can go either to the left or to the right out of the row.
//They will choose the direction that minimises the number of people they have to disturb (i.e., the number of people they must pass by).
//
//Your task is to determine the total number of times people were disturbed during this entire process
//
//Input Format
//The first line of input will contain a single integer
//T
//T, denoting the number of test cases.
//Each test case consists of two lines:
//The first line contains an integer
//N
//N — the number of seats.
//The second line contains
//N
//N space-separated integers representing the permutation
//        P
//1
//        ,
//P
//2
//        ,
//        …
//        ,
//P
//        N
//P
//1
//        ​
//        ,P
//2
//        ​
//        ,…,P
//        N
//​
//        .
//Output Format
//For each test case, print a single integer — the total number of times people were disturbed when all people leave in the described manner.
//
//Constraints
//1
//        ≤
//T
//≤
//        10
//        5
//        1≤T≤10
//        5
//
//        1
//        ≤
//N
//≤
//        10
//        1≤N≤10
//The sum of
//        N
//N over all test cases won't exceed
//        4
//        ⋅
//        10
//        5
//        4⋅10
//        5
//        .
//Sample 1:
//Input
//        Output
//6
//        1
//        1
//        2
//        2 1
//        3
//        3 2 1
//        3
//        1 3 2
//        4
//        1 4 3 2
//        5
//        1 5 3 4 2
//        0
//        0
//        0
//        1
//        2
//        3
//Explanation:
//For the first test case, one of the optimal possibility is:
//
//Person
//1
//        1 moves to left disturbing
//0
//        0 people.
//For the sixth test case, one of the optimal possibility is:
//
//Person
//5
//        5 moves to left disturbing
//1
//        1 people.
//        Person
//4
//        4 moves to right disturbing
//1
//        1 people.
//        Person
//3
//        3 moves to right disturbing
//1
//        1 people.
//        Person
//2
//        2 moves to right disturbing
//0
//        0 people.
//        Person
//1
//        1 moves to right disturbing
//0
//        0 people.

public class Class {


}
